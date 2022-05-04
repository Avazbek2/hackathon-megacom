package kg.itschool.reservationconferencehall.models.dto;

import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import kg.itschool.reservationconferencehall.models.entity.Department;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;


@Data
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto implements Serializable {


    Long id;

    ConfRoom confRoom;

    LocalTime start_time;

    LocalTime end_time;

    Date date;

    String fullName;

    Department department;

    Boolean isActive;
}

