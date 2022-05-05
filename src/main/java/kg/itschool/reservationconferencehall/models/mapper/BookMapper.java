package kg.itschool.reservationconferencehall.models.mapper;


import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book , BookDto>{
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);





}
