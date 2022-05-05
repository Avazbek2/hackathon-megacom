package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.mapper.BookMapper;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.repository.BookRepository;
import kg.itschool.reservationconferencehall.respons.BookSaveResponse;
import kg.itschool.reservationconferencehall.services.BookService;


import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookServiceImpl implements BookService {


   @NonNull BookRepository bookRepository;
   BookMapper bookMapper = BookMapper.INSTANCE;



   @Override
   public BookSaveResponse save(BookDto bookDto) {
       BookSaveResponse bookSaveResponse = new BookSaveResponse();
       List<Book> isExists = bookRepository.existsAllByConfRoomAndDate(bookDto.getConfRoom().getId(), bookDto.getDate(), bookDto.getStart_time(), bookDto.getEnd_time());
       if (!isExists.isEmpty()) {
           bookSaveResponse.setStatus(0);
           bookSaveResponse.setMessage("Room is busy");
           return bookSaveResponse;
       }
       Book book = bookMapper.bookFromDto(bookDto);
       book.setIsActive(true);
       Book savedBook = bookRepository.save(book);
       if (savedBook != null) {
           bookSaveResponse.setStatus(1);
           bookSaveResponse.setMessage("Success");
           return bookSaveResponse;
       }
       bookSaveResponse.setStatus(0);
       bookSaveResponse.setMessage("Error in saving");
       return bookSaveResponse;
   }




    @Override
    public BookDto delete(BookDto bookDto) {
        Book book = bookMapper.bookFromDto(findById(bookDto.getId()));

        book.setIsActive(false);

            return bookMapper.bookToDto(book);
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found book with " + id + " id"));

            return BookMapper.INSTANCE.bookToDto(book);
    }

    @Override
    public BookDto update(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> findAllByConfRoom(ConfRoomDto confRoomDto) {
        return null;
    }
}
