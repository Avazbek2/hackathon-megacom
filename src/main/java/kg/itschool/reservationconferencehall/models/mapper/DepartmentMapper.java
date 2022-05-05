package kg.itschool.reservationconferencehall.models.mapper;

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

    List<Department> ListDepartmentsFromDto(List<DepartmentDto> ListDepartmentsDto);

    List<DepartmentDto>ListDepartmentsToDto(List<Department> ListDepartments);



}
