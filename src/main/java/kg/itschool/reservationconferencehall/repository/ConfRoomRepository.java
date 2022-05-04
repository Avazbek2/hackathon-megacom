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
}
