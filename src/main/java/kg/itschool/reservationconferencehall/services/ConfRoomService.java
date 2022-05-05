package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;

import java.util.List;

public interface ConfRoomService {
    ConfRoomDto save(ConfRoomDto confRoomDto);

    ConfRoomDto delete(ConfRoomDto confRoomDto);

    ConfRoomDto findById(Long id);

    ConfRoomDto update(ConfRoomDto confRoomDto);

    List<ConfRoomDto> findAllConfRoom();

    List<ConfRoomDto> filter(int amountPerson , boolean projector , boolean conditioner , boolean board );

}
