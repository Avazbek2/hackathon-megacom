package kg.itschool.reservationconferencehall.models.requests;

import lombok.Data;


@Data
public class FilterRequest {
    Integer amountPerson ;
    Boolean projector;
    Boolean conditioner;
    Boolean board;
}
