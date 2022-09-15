package mg.diha_agency_api.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.service.ClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ClientController {

  private ClientService service;

  @GetMapping("/clients/{client_id}")
  public Client getClientById(
      @PathVariable("client_id") Long clientId) {
      return service.getClientById(clientId);
  }

  @PutMapping ("/clients/{client_id}")
  public Client updateClientById(
      @PathVariable("client_id") Long clientId, @RequestBody Client updatedClient) {
    return service.updateClientById(clientId,updatedClient);
  }

  @DeleteMapping("/clients/{client_id}")
  public String deleteClientById(
      @PathVariable("client_id") Long clientId) {
    service.deleteClientById(clientId);
    return "Client deleted!";
  }

  @PostMapping("/clients")
  public Client createNewClient(@RequestBody Client newClient ) {
     return  service.createNewClient(newClient);
  }

  @GetMapping("/clients")
  public List<Client> getClients(
      @RequestParam(value = "ordered") String ordered) {
    return  service.getClients(ordered);
  }

}
