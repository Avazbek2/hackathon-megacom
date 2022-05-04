package kg.itschool.reservationconferencehall.mappers;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    BookDto bookToDto(Book book);

    Book bookFromDto(BookDto bookDto);

    List<BookDto> bookToDto(List<Book> books);

    List<Book> bookFromDto(List<BookDto> bookDtos);
}
