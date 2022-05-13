package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_book")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {


    @Id
    @Column(name = "id" , insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "confroom_id" ,referencedColumnName = "id"  )
    ConfRoom confRoom;

    @Column(name = "start_time" , nullable = false)
    LocalTime startTime;

    @Column(name = "end_time" , nullable = false)
    LocalTime endTime;

    @Column(name = "date" , nullable = false )
    LocalDate date;

    @Column(name = "full_name" , nullable = false)
    String fullName;

    @ManyToOne
    @JoinColumn(name = "department_id" , referencedColumnName = "id" )
    Department department;


    @Column(name = "is_active")
    Boolean isActive;




}
