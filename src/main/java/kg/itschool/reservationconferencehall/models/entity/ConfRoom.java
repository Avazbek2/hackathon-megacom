package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_confroom")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoom {

    @Id
    @Column(name = "id" , updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name" , nullable = false)
    String name;

    @Column(name = "capacity" , nullable = false)
    Integer capacity;

    @Column(name = "is_active"  )
    Boolean isActive;

    @Column(name = "description" , nullable = false , length = 1000)
    String description;

    @Column(name = "projector" , nullable = false)
    Boolean projector;

    @Column(name = "conditioner" , nullable = false)
    Boolean conditioner;

    @Column(name = "board" , nullable = false)
    Boolean board;
}
