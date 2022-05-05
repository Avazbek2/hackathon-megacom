package kg.itschool.reservationconferencehall.models.mapper;


import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfRoomMapper extends BaseMapper<ConfRoom , ConfRoomDto>{
    ConfRoomMapper INSTANCE = Mappers.getMapper(ConfRoomMapper.class);





}
