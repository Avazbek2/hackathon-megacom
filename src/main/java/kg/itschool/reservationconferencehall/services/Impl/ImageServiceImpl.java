package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.models.dto.ImageDto;
import kg.itschool.reservationconferencehall.models.mapper.ImageMapper;
import kg.itschool.reservationconferencehall.models.entity.Image;
import kg.itschool.reservationconferencehall.repository.ImageRepository;
import kg.itschool.reservationconferencehall.services.ImageService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ImageServiceImpl implements ImageService {



    ImageMapper imageMapper  = ImageMapper.INSTANCE;
    @NonNull ImageRepository imageRepository;



    @Override
    public ImageDto save(ImageDto imageDto) {
        Image image = imageMapper.toEntity(imageDto);


        image.setIsActive(true);

        imageRepository.save(image);

        return imageMapper.toDto(image);
    }

    @Override
    public ImageDto delete(ImageDto imageDto) {
        Image image = imageMapper.toEntity(findById(imageDto.getId()));
        image.setIsActive(false);

        return imageMapper.toDto(image);

    }

    @Override
    public ImageDto findById(Long id) {
        Image image = imageRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found Image with " + id + " id"));

        return imageMapper.toDto(image);
    }

    @Override
    public ImageDto update(ImageDto imageDto) {
        Image image = imageMapper.toEntity(findById(imageDto.getId()));
        image.setIsActive(false);

        return imageMapper.toDto(image);
    }

    @Override
    public List<ImageDto> findAllByConfRoomId(Long confRoomId) {
        return null;
    }
}
