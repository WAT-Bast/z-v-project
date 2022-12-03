package project.z_v.manager.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.z_v.manager.entity.managerEntity;

@Repository     // db
public interface managerRepository extends JpaRepository<managerEntity, Long> {

}
