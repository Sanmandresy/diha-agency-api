package mg.diha_agency_api.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.repository.ClientRepository;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

  private ClientRepository repository;

  public Client getClientById(Long clientId) {
    return repository.getClientByClientId(clientId);
  }

  @Transactional
  public void deleteClientById(Long clientId) {
    repository.removeClientByClientId(clientId);
  }

  public Client updateClientById(Long clientId,Client updatedClient) {
    Client actual = repository.getClientByClientId(clientId);
    actual.setLastName(updatedClient.getLastName());
    actual.setFirstName(updatedClient.getFirstName());
    actual.setAddress(updatedClient.getAddress());
    actual.setGender(updatedClient.getGender());
    actual.setBirthdate(updatedClient.getBirthdate());
    actual.setPhone(updatedClient.getPhone());
    actual.setEmail(updatedClient.getEmail());
    actual.setPassword(updatedClient.getPassword());
    actual.setNationality(updatedClient.getNationality());
    actual.setCreditCardNumber(updatedClient.getCreditCardNumber());
    return repository.save(actual);
  }

  @Transactional
  public Client createNewClient(Client newClient) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    Client toCheck = findByUsername(newClient.getUsername());
    if(toCheck == null){
      newClient.setPassword(passwordEncoder.encode(newClient.getPassword()));
    }
    return repository.save(newClient);
  }

  public List<Client> getClients(String ordered) {
    return repository.getAllClients(Sort.by(ordered));
  }

  public Client findByUsername(String username){
    Optional<Client> client = repository.findByUsername(username);
    return client.orElse(null);
  }

}
