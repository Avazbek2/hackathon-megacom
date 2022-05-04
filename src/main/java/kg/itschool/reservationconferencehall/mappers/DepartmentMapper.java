package kg.itschool.reservationconferencehall.mappers;

import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import kg.itschool.reservationconferencehall.models.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDto departmentToDto(Department department);

    Department departmentFromDto(DepartmentDto departmentDto);

    List<DepartmentDto> departmentToDto(List<Department> departments);

    List<Department> departmentFromDto(List<DepartmentDto> departmentDtos);
}
