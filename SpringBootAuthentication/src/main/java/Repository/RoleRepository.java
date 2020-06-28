package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.ERole;
import models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<ERole> findByName(ERole name);
}
