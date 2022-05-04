package kg.itschool.reservationconferencehall.mappers;


import kg.itschool.reservationconferencehall.models.dto.ImageDto;
import kg.itschool.reservationconferencehall.models.entity.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ImageMapper {
    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    ImageDto imageToDto(Image image);

    Image imageFromDto(ImageDto imageDto);

    List<ImageDto> imageToDto(List<Image> images);

    List<Image> imagerFromDto(List<ImageDto> imageDtos);
}
