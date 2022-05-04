package kg.itschool.reservationconferencehall.models.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DepartmentDto implements Serializable {

    Long id;

    String name;


    Boolean isActive;
}
