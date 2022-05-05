package kg.itschool.reservationconferencehall.models.mapper;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department , DepartmentDto>{
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);





}
