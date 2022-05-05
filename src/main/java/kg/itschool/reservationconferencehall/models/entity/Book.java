package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {


    @Id
    @Column(name = "id")
    Long id;

    @ManyToOne
    @JoinColumn(name = "confroom_id" ,referencedColumnName = "id")
    ConfRoom confRoom;

    @Column(name = "start_time" , nullable = false)
    LocalTime start_time;

    @Column(name = "end_time" , nullable = false)
    LocalTime end_time;

    @Column(name = "date" , nullable = false)
    Date date;

    @Column(name = "full_name" , nullable = false)
    String fullName;

    @ManyToOne
    @JoinColumn(name = "department_id" , referencedColumnName = "id")
    Department department;


    @Column(name = "is_active")
    Boolean isActive;




}
