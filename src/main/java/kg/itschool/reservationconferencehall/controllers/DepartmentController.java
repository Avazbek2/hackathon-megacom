package kg.itschool.reservationconferencehall.controllers;

import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import kg.itschool.reservationconferencehall.services.DepartmentService;
import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/department")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentController {

    @NonNull DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody DepartmentDto request){

        DepartmentDto departmentDto = departmentService.save(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(departmentDto);
    }

}
