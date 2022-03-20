package readBookAndBuy.readBookAndBuy.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import readBookAndBuy.readBookAndBuy.domain.entity.Member;

public interface UserRepository extends JpaRepository<Member, Long> {
}
