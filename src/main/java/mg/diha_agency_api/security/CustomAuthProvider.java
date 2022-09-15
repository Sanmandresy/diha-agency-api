package mg.diha_agency_api.security;

import java.security.Principal;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.repository.ClientRepository;
import mg.diha_agency_api.security.model.CustomUserDetails;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class CustomAuthProvider extends AbstractUserDetailsAuthenticationProvider {

  private final ClientRepository clientRepository;

  private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  @Override
  protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                UsernamePasswordAuthenticationToken authentication)
      throws AuthenticationException {

  }

  @Override
  protected UserDetails retrieveUser(String username,
                                     UsernamePasswordAuthenticationToken authentication)
      throws AuthenticationException {
      String email = authentication.getName();
      String password = authentication.getCredentials().toString();

      Client client = clientRepository.findByUsername(email).orElse(null);

      if(client != null && passwordEncoder.matches(password, client.getPassword())) {
        return new CustomUserDetails(client);
      } else {
        throw new BadCredentialsException("Invalid username and/or password !");
      }
  }
}
