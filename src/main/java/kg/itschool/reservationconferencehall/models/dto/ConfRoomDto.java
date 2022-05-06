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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoomDto implements Serializable {
    Long id;

    String name;

    Integer capacity;

    Boolean isActive;

    String description;

    Boolean projector;

    Boolean conditioner;

    Boolean board;


}

