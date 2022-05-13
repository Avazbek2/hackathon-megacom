package kg.itschool.reservationconferencehall.models.requests;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class CreateBooking {
    Long confRoomId;

    @DateTimeFormat(pattern = "HH:mm")
    LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm")
    LocalTime endTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate date;

    String fullName;

    Long departmentId;

    Boolean isActive;

}
