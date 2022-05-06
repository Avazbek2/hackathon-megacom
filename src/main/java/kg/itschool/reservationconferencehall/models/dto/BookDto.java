package kg.itschool.reservationconferencehall.models.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDto implements Serializable {
    Long id;
    ConfRoomDto confRoom;

    @DateTimeFormat(pattern = "HH:mm")
    LocalTime startTime;

    @DateTimeFormat(pattern = "HH:mm")
    LocalTime endTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate date;

    String fullName;

    DepartmentDto department;

    Boolean isActive;
}
