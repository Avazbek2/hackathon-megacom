package kg.itschool.reservationconferencehall.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.function.LongToIntFunction;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image {

    @Id
    Long id;

    @Column(name = "link" , nullable = false)
    String link;

    @ManyToOne
    @JoinColumn(name = "confroom_id" , referencedColumnName = "id")
    ConfRoom confRoom;

    @Column(name = "order_num" , nullable = false)
    Integer orderNum;

    @Column(name = "is_active" )
    Boolean isActive;
}
