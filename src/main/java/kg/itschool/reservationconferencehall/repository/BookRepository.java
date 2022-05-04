package kg.itschool.reservationconferencehall.repository;

import kg.itschool.reservationconferencehall.models.entity.Book;
import kg.itschool.reservationconferencehall.respons.BookSaveResponse;
import org.hibernate.tool.schema.extract.internal.TableInformationImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "select * from tb_book b where b.confroom_id = ?1 and b.date = DATE ?2 and (b.start_time = ?3 or b.and_time = ?4)" , nativeQuery = true)
    List<Book> existsAllByConfRoomAndDate(Long consRoomId , Date date , LocalTime startTime , LocalTime endTime);
}
