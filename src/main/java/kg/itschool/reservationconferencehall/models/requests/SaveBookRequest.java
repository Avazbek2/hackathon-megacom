package kg.itschool.reservationconferencehall.models.requests;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import kg.itschool.reservationconferencehall.models.dto.DepartmentDto;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;
import java.util.Date;

public class SaveBookRequest {
    private ConfRoomDto confRoom;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm")
    private  LocalTime endTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date date;

    private  String fullName;

    private DepartmentDto department;

    private  Boolean isActive;

}
