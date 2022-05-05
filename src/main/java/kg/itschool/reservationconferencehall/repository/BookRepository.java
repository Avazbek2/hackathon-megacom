package kg.itschool.reservationconferencehall.repository;

import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.models.entity.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByConfRoom(ConfRoom confRoom);

    @Query(value = "select * from tb_book b where b.confroom_id = ?1 and b.date = DATE ?2 and (b.start_time = ?3 or b.end_time = ?4)" , nativeQuery = true)
    List<Book> existsAllByConfRoomAndDate(Long confRoomId , LocalDate date , LocalTime startTime , LocalTime endTime);

    @Query(value = "select * from tb_book b   where b.confroom_id = ?1 and b.date = ?2 and( b.start_time = ?3 or b.end_time = ?4)" , nativeQuery = true)
    List<Book> findAllByConfRoomIdAndDateAndStart_timeAndEnd_time(Long confRoomId , LocalDate date , LocalTime startTime , LocalTime endTime);
}
