package kg.itschool.reservationconferencehall.models.dto;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

public class ImageDto implements Serializable {
    private  Long id;
    private  String link;
    private  ConfRoomDto confRoom;
    private  Integer orderNum;
    private  Boolean isActive;
}
