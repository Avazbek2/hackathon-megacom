package kg.itschool.reservationconferencehall.repository;

import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfRoomRepository extends JpaRepository<ConfRoom , Long> {

    @Query("select c from ConfRoom  c where c.isActive = true ")
    List<ConfRoom> findAllConfRoom();

    @Query(value = "SELECT  * FROM (SELECT * FROM (SELECT * FROM" +
            "                            (SELECT * FROM tb_confroom c WHERE c.capacity >= ?1) AS " +
            "               WHERE c.board = ?2) AS " +
            "                    WHERE b.conditioner = ?3) AS " +
            "                            WHERE c.projector = ?4" , nativeQuery = true)
    List<ConfRoom> findAllByCapacityAndBoardAndConditionerAndProjector(Integer capacity , Boolean board , Boolean conditioner , Boolean projector);
}
