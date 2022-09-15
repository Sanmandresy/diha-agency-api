package mg.diha_agency_api.service;

import java.util.Optional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Admin;
import mg.diha_agency_api.repository.AdminRepository;
import mg.diha_agency_api.security.model.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailService implements UserDetailsService {
  private final AdminRepository repository;

  @Override
  public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Admin> user = repository.findByUsername(username);
    if (user.isEmpty()) {
      throw new UsernameNotFoundException(username+" not found in the database.");
    }
    return new CustomUserDetails(user.get());
  }
}
