package kg.itschool.reservationconferencehall.models.mapper;


import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfRoomMapper extends BaseMapper<ConfRoom , ConfRoomDto>{
    ConfRoomMapper INSTANCE = Mappers.getMapper(ConfRoomMapper.class);

    ConfRoom toEntity(ConfRoomDto dto);
    ConfRoomDto toDto(ConfRoom entity);
    List<ConfRoom> toEntityList(List<ConfRoomDto> dtoList);
    List<ConfRoomDto> toDtoList(List<ConfRoom> entityList);



}
