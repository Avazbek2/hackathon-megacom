package kg.itschool.reservationconferencehall.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import java.io.Serializable;

@Data
public class ConfRoomDto implements Serializable {
    private  Long   id;
    private  String  name;
    private  Integer capacity;
    private  Boolean isActive;
    private  String  description;
    private  Boolean project;
    private  Boolean airconditioner;
    private  Boolean desk;
}
