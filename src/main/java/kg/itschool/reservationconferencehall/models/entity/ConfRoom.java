package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "isActive"  )
    Boolean isActive;

    @Column(name = "description" , nullable = false , length = 1000)
    String description;

    @Column(name = "project" , nullable = false)
    Boolean project;

    @Column(name = "aircondit" , nullable = false)
    Boolean airconditioner;

    @Column(name = "desk" , nullable = false)
    Boolean desk;
}
