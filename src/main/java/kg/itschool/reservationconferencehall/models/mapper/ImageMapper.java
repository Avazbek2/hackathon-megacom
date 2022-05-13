package kg.itschool.reservationconferencehall.models.mapper;

import kg.itschool.reservationconferencehall.models.entity.Image;
import kg.itschool.reservationconferencehall.models.dto.ImageDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ImageMapper {

    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

   Image toEntity(ImageDto dto);
   ImageDto toDto(Image entity);
   List<Image> toEntityList(List<ImageDto> dtoList);
   List<ImageDto> toDtoList(List<Image> entityList);

}
