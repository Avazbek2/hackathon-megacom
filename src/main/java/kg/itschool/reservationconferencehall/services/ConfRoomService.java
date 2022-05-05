package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.requests.CreateConfRoomRequest;

import java.util.List;

public interface ConfRoomService {
    ConfRoomDto create(CreateConfRoomRequest request);

    ConfRoomDto save(ConfRoomDto confRoomDto);

    ConfRoomDto delete(Long id);

    ConfRoomDto findById(Long id);

    ConfRoomDto update(ConfRoomDto confRoomDto);

    List<ConfRoomDto> findAllConfRoom();

    List<ConfRoomDto> filter(int amountPerson , boolean projector , boolean conditioner , boolean board );

}
