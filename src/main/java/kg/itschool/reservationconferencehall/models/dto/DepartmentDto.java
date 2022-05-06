package kg.itschool.reservationconferencehall.models.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentDto implements Serializable {
    Long id;
    String name;
    Boolean isActive;
}
