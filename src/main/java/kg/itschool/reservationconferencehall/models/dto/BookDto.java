package kg.itschool.reservationconferencehall.models.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@ToString

public class BookDto implements Serializable {
    private  Long id;

    private  ConfRoomDto confRoom;

    @DateTimeFormat(pattern = "HH:mm" )
    private  LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm" )
    private  LocalTime endTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    private  String fullName;

    private  DepartmentDto department;

    private  Boolean isActive;


}
