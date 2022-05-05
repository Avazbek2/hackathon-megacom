package kg.itschool.reservationconferencehall.models.mapper;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ImageDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ImageMapper extends BaseMapper<Image , ImageDto>{
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);




}
