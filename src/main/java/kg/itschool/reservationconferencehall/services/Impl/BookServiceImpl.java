package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import kg.itschool.reservationconferencehall.models.entity.Department;
import kg.itschool.reservationconferencehall.models.mapper.BookMapper;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.mapper.ConfRoomMapper;
import kg.itschool.reservationconferencehall.models.mapper.DepartmentMapper;
import kg.itschool.reservationconferencehall.repository.BookRepository;
import kg.itschool.reservationconferencehall.respons.BookSaveResponse;
import kg.itschool.reservationconferencehall.services.BookService;


import kg.itschool.reservationconferencehall.services.ConfRoomService;
import kg.itschool.reservationconferencehall.services.DepartmentService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookServiceImpl implements BookService {


   @NonNull BookRepository bookRepository;
   @NonNull ConfRoomService confRoomService;
   @NonNull DepartmentService departmentService;


   BookMapper bookMapper = BookMapper.INSTANCE;
   ConfRoomMapper confRoomMapper= ConfRoomMapper.INSTANCE;
   DepartmentMapper departmentMapper = DepartmentMapper.INSTANCE;



   @Override
   public BookSaveResponse save(BookDto bookDto) {
       System.out.println(bookDto);
       BookSaveResponse bookSaveResponse = new BookSaveResponse();
       System.out.println(bookDto);
       List<Book> isExists = bookRepository.findAllByConfRoomIdAndDateAndStart_timeAndEnd_time(bookDto.getConfRoom().getId(), bookDto.getDate(), bookDto.getStartTime(), bookDto.getEndTime());
       System.out.println( "isExists" + isExists );
       if (!isExists.isEmpty()) {
           bookSaveResponse.setStatus(0);
           bookSaveResponse.setMessage("Room is busy");
           return bookSaveResponse;
       }
       Book book = Book
               .builder()
               .id(bookDto.getId())
               .confRoom(ConfRoom
                       .builder()
                       .id(bookDto.getConfRoom().getId())
                       .name(bookDto.getConfRoom().getName())
                       .capacity(bookDto.getConfRoom().getCapacity())
                       .description(bookDto.getConfRoom().getDescription())
                       .desk(bookDto.getConfRoom().getDesk())
                       .project(bookDto.getConfRoom().getProject())
                       .airconditioner(bookDto.getConfRoom().getAirconditioner())
                       .build())
               .start_time(bookDto.getStartTime())
               .end_time(bookDto.getEndTime())
               .date(bookDto.getDate())
               .fullName(bookDto.getFullName())
               .department(Department
                       .builder()
                       .id(bookDto.getDepartment().getId())
                       .name(bookDto.getDepartment().getName())
                       .isActive(bookDto.getDepartment().getIsActive())
                       .build())
               .isActive(true)
               .build();

       System.out.println(book);
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
        Book book = bookMapper.toEntity(findById(bookDto.getId()));

        book.setIsActive(false);
        bookRepository.save(book);

            return bookMapper.toDto(book);
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found book with " + id + " id"));

        System.out.println(book);

            return BookMapper.INSTANCE.toDto(book);
    }

    @Override
    public BookDto update(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> findAllByConfRoom(ConfRoomDto confRoomDto) {
       List<Book> books =  bookRepository.findAllByConfRoom(confRoomMapper.toEntity(confRoomDto));

        return bookMapper.toDtoList(books);
    }
}
