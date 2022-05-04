package kg.itschool.reservationconferencehall.mappers;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfRoomMapper {
    ConfRoomMapper INSTANCE = Mappers.getMapper(ConfRoomMapper.class);

    ConfRoomDto confRoomToDto(ConfRoom confRoom);

    ConfRoom confRoomFromDto(ConfRoomDto confRoomDto);

    List<ConfRoomDto> confRoomsToDto(List<ConfRoom> confRooms);

    List<ConfRoom> confRoomFromDto(List<ConfRoomDto> confRoomDto);

}
