package kg.itschool.reservationconferencehall.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto implements Serializable {
    private  Long id;
    private  ConfRoomDto confRoom;
    private  LocalTime start_time;
    private  LocalTime end_time;
    private  Date date;
    private  String fullName;
    private  DepartmentDto department;
    private  Boolean isActive;


}
