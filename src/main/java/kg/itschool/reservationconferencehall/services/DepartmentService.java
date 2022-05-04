package kg.itschool.reservationconferencehall.services;

import kg.itschool.reservationconferencehall.models.dto.BookDto;
import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {

    DepartmentDto save(DepartmentDto departmentDto);

    DepartmentDto delete(DepartmentDto departmentDto);

    DepartmentDto findById(Long id);

    DepartmentDto update(DepartmentDto departmentDto);

    List<DepartmentDto> findAll();
}
