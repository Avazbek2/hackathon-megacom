package kg.itschool.reservationconferencehall.models.requests;

import lombok.Data;

@Data
public class CreateConfRoomRequest {
    String name;

    Integer capacity;

    //Boolean isActive;

    String description;

    Boolean projector;

    Boolean conditioner;

    Boolean board;
}
