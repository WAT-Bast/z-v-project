package project.z_v.UserDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.z_v.UserDB.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByUserId(String userId);

   User findByUserId(String loginId);

   User findByUserIdAndUserPW(String userId, String userPW);
}
