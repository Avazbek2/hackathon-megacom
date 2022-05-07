package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.respons.BookSaveResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {



    BookSaveResponse save(BookDto bookDto);

    BookDto delete(BookDto bookDto);

    BookDto findById(Long id);

    BookDto update(BookDto bookDto);

    List<BookDto> findAllByConfRoomId(Long id );

}
