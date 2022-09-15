package mg.diha_agency_api.service;

import java.util.List;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.repository.ClientRepository;
import org.springframework.data.domain.Sort;
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
    actual.setNationality(updatedClient.getNationality());
    actual.setCreditCardNumber(updatedClient.getCreditCardNumber());
    return repository.save(actual);
  }

  @Transactional
  public Client createNewClient(Client newClient) {
    return repository.save(newClient);
  }

  public List<Client> getClients(String ordered) {
    return repository.getAllClients(Sort.by(ordered));
  }


}
