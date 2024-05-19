package ch.fdsgn.usercrud.repo;

import ch.fdsgn.usercrud.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {


}
