package mg.diha_agency_api.repository;

import java.util.List;
import java.util.Optional;
import mg.diha_agency_api.model.Client;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

  Client getClientByClientId(Long clientId);

  void removeClientByClientId(Long clientId);

  Optional<Client> findByUsername(String username);

  @Query(value = "select c from Client c")
  List<Client> getAllClients(Sort sort);
}
