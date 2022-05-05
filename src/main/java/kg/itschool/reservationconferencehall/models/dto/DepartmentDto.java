package kg.itschool.reservationconferencehall.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

public class DepartmentDto implements Serializable {
    private  Long id;
    private  String name;
    private  Boolean isActive;
}
