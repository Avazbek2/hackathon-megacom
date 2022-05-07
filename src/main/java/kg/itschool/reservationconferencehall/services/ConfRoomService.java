package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.requests.CreateConfRoomRequest;
import kg.itschool.reservationconferencehall.models.requests.FilterRequest;

import java.util.List;

public interface ConfRoomService {


    ConfRoomDto save(CreateConfRoomRequest request);

    ConfRoomDto delete(Long id);

    ConfRoomDto findById(Long id);

    ConfRoomDto update(ConfRoomDto confRoomDto);

    List<ConfRoomDto> findAllConfRoom();

    List<ConfRoomDto> filter(FilterRequest request);

}
