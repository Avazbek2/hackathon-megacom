package kg.itschool.reservationconferencehall.models.requests;

import lombok.Data;

@Data
public class CreateConfRoomRequest {
    String name;

    Integer capacity;



    String description;

    Boolean projector;

    Boolean conditioner;

    Boolean board;
}
