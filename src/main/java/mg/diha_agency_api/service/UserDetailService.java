package mg.diha_agency_api.service;

import java.util.Optional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.repository.ClientRepository;
import mg.diha_agency_api.security.model.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {
  private final ClientRepository repository;

  @Override
  public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Client> user = repository.findByUsername(username);
    if (user.isEmpty()) {
      throw new UsernameNotFoundException(username+" not found in the database.");
    }
    return new CustomUserDetails(user.get());
  }
}
