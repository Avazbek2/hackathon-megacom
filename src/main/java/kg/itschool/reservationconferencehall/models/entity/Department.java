package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_department")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department {

    @Id
    @Column(name = "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name" ,  nullable = false  )
    String name;

    @Column(name = "is_active")
    Boolean isActive;
}
