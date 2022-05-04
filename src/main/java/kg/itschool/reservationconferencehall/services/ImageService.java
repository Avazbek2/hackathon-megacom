package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ImageDto;

import java.util.List;

public interface ImageService {

    ImageDto save(ImageDto imageDto);

    ImageDto delete(ImageDto imageDto);

    ImageDto findById(Long id);

    ImageDto update(ImageDto imageDto);

    List<ImageDto> findAllByConfRoomId(Long confRoomId);
}
