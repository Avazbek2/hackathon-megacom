package kg.itschool.reservationconferencehall.models.dto;

import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@Builder


@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ImageDto implements Serializable {
    Long id;


    String link;

    ConfRoom confRoom;

    Integer orderNum;

    Boolean isActive;
}
