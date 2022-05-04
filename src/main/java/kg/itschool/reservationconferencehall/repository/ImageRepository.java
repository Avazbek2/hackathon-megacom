package kg.itschool.reservationconferencehall.repository;

import kg.itschool.reservationconferencehall.models.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}
