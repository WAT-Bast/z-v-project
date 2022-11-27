package project.z_v.reviewDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.z_v.manager.entity.managerEntity;
import project.z_v.reviewDB.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> findAllByManagerEntity(managerEntity managerEntity);
}
