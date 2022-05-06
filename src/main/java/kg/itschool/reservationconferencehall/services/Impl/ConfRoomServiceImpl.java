package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.mapper.ConfRoomMapper;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import kg.itschool.reservationconferencehall.models.requests.CreateConfRoomRequest;
import kg.itschool.reservationconferencehall.repository.ConfRoomRepository;
import kg.itschool.reservationconferencehall.services.ConfRoomService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoomServiceImpl implements ConfRoomService {


   @NonNull ConfRoomRepository confRoomRepository;

    ConfRoomMapper confRoommapper = ConfRoomMapper.INSTANCE;


    @Override
    public ConfRoomDto create(CreateConfRoomRequest request) {

        ConfRoom confRoom =ConfRoom
                                .builder()
                                .name(request.getName())
                                .description(request.getDescription())
                                .capacity(request.getCapacity())
                                .conditioner(request.getAirconditioner())
                                .board(request.getDesk())
                                .projector(request.getProject())
                                .isActive(true)
                                .build();
        confRoomRepository.save(confRoom);
        System.out.println(confRoom);

        return confRoommapper.toDto(confRoom);

    }

    @Override
    public ConfRoomDto save(ConfRoomDto confRoomDto) {
        ConfRoom confRoom = confRoommapper.toEntity(confRoomDto);
        confRoom.setIsActive(true);
        confRoomRepository.save(confRoom);



        return confRoommapper.toDto(confRoom);
    }

    @Override
    public ConfRoomDto delete(Long id) {
        ConfRoom confRoom = confRoommapper.toEntity(findById(id));

        confRoom.setIsActive(false);
        confRoomRepository.save(confRoom);

        return confRoommapper.toDto(confRoom);
    }

    @Override
    public ConfRoomDto findById(Long id) {
        ConfRoom confRoom = confRoomRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found Conf Room with " + id + " id"));


        return confRoommapper.toDto(confRoom);
    }

    @Override
    public ConfRoomDto update(ConfRoomDto confRoomDto) {
        return null;
    }

    @Override
    public List<ConfRoomDto> findAllConfRoom() {
        List<ConfRoom> confRoom = confRoomRepository.findAllConfRoom();
        System.out.println(confRoom);

        return confRoommapper.toDtoList(confRoom);
    }

    @Override
    public List<ConfRoomDto> filter(int amountPerson, boolean projector, boolean conditioner, boolean board) {
        return null;
    }
}
