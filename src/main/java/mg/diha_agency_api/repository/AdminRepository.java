package mg.diha_agency_api.repository;

import java.util.Optional;
import mg.diha_agency_api.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
  Optional<Admin> findByUsername(String username);
}
