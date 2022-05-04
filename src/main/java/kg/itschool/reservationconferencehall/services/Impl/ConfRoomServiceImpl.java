package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.mappers.ConfRoomMapper;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import kg.itschool.reservationconferencehall.repository.ConfRoomRepository;
import kg.itschool.reservationconferencehall.services.ConfRoomService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoomServiceImpl implements ConfRoomService {


   @NonNull ConfRoomRepository confRoomRepository;
    @NonNull  ConfRoomMapper confRoommapper;



    @Override
    public ConfRoomDto save(ConfRoomDto confRoomDto) {
        ConfRoom confRoom = confRoommapper.confRoomFromDto(confRoomDto);
        confRoom.setIsActive(true);
        confRoomRepository.save(confRoom);



        return confRoommapper.confRoomToDto(confRoom);
    }

    @Override
    public ConfRoomDto delete(ConfRoomDto confRoomDto) {
        ConfRoom confRoom = confRoommapper.confRoomFromDto(findById(confRoomDto.getId()));

        return confRoommapper.confRoomToDto(confRoom);
    }

    @Override
    public ConfRoomDto findById(Long id) {
        ConfRoom confRoom = confRoomRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found Conf Room with " + id + " id"));


        return confRoommapper.confRoomToDto(confRoom);
    }

    @Override
    public ConfRoomDto update(ConfRoomDto confRoomDto) {
        return null;
    }

    @Override
    public List<ConfRoomDto> findAllConfRoom() {
        List<ConfRoom> confRoom = confRoomRepository.findAllConfRoom();

        return confRoommapper.confRoomsToDto(confRoom);
    }

    @Override
    public List<ConfRoomDto> filter(int amountPerson, boolean projector, boolean conditioner, boolean board) {
        return null;
    }
}
