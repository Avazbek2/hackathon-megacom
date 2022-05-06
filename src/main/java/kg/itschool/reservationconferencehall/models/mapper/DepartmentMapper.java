package kg.itschool.reservationconferencehall.models.mapper;


import kg.itschool.reservationconferencehall.models.entity.Department;
import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department , DepartmentDto>{

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
//
//    Department toEntity(DepartmentDto dto);
//    DepartmentDto toDto(Department entity);
//    List<Department> toEntityList(List<DepartmentDto> dtoList);
//    List<DepartmentDto> toDtoList(List<Department> entityList);

}
