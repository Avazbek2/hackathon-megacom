package kg.itschool.reservationconferencehall.models.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateConfRoomRequest {
      String  name;
      Integer capacity;
      String  description;
      Boolean project;
      Boolean airconditioner;
      Boolean desk;
}
