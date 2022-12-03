package project.z_v.manager.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.z_v.manager.entity.managerEntity;

import java.util.List;

@Repository     // db
public interface managerRepository extends JpaRepository<managerEntity, Long> {

    @Query("select me from managerEntity me where me.Hosptial_name like %:keyword%")
    List<managerEntity> manager(@Param("keyword") String keyword);

}
