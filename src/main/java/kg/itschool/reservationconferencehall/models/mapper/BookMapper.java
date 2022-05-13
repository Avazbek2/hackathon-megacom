package kg.itschool.reservationconferencehall.models.mapper;

import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toEntity(BookDto dto);
    BookDto toDto(Book entity);
    List<Book> toEntityList(List<BookDto> dtoList);
    List<BookDto> toDtoList(List<Book> entityList);


}
