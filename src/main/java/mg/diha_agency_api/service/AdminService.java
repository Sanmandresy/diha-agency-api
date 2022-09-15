package mg.diha_agency_api.service;

import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Admin;
import mg.diha_agency_api.repository.AdminRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {

  private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
  private AdminRepository repository;

  public Admin createNewAdmin(Admin newAdmin) {
    newAdmin.setPassword(passwordEncoder.encode(newAdmin.getPassword()));
    return repository.save(newAdmin);
  }

}
