package kg.itschool.reservationconferencehall.models.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.function.LongToIntFunction;

@Data
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
