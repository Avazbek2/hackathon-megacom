package kg.itschool.reservationconferencehall.services.Impl;

import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import kg.itschool.reservationconferencehall.models.mapper.DepartmentMapper;
import kg.itschool.reservationconferencehall.models.entity.Department;
import kg.itschool.reservationconferencehall.repository.DepartmentRepository;
import kg.itschool.reservationconferencehall.services.DepartmentService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentServiceImpl implements DepartmentService {



   @NonNull DepartmentRepository departmentRepository;
   DepartmentMapper departmentMapper = DepartmentMapper.INSTANCE;



    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {

        Department department = departmentMapper.departmentFromDto(departmentDto);
        department.setIsActive(true);

        Department savedDepartment = departmentRepository.save(department);

        return departmentMapper.departmentToDto(department);
    }

    @Override
    public DepartmentDto delete(DepartmentDto departmentDto) {
        Department department = departmentMapper.departmentFromDto(findById(departmentDto.getId()));

        department.setIsActive(false);




        return null;
    }

    @Override
    public DepartmentDto findById(Long id) {
         Department department = departmentRepository.findById(id).orElseThrow(
                 () -> new RuntimeException("Not found Department with " + id + " id"));

        return departmentMapper.departmentToDto(department);
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        return null;
    }

    @Override
    public List<DepartmentDto> findAll() {

       List<Department>  departments = departmentRepository.findAll();


       return departmentMapper.ListDepartmentsToDto(departments);
    }
}
