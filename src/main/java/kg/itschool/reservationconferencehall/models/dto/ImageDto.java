package kg.itschool.reservationconferencehall.models.dto;

import kg.itschool.reservationconferencehall.models.dto.ConfRoomDto;
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
public class ImageDto implements Serializable {
      Long id;
      String link;
      ConfRoomDto confRoom;
      Integer orderNum;
      Boolean isActive;
}
