package mg.diha_agency_api.security;

import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Client;
import mg.diha_agency_api.repository.ClientRepository;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomAuthProvider implements AuthenticationProvider {

  private ClientRepository clientRepository;


  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {

    String username = authentication.getName();
    String password = authentication.getCredentials().toString();

    Client client = clientRepository.findByUsername(username).orElse(null);

    if(client != null && new BCryptPasswordEncoder().matches(password , client.getPassword())){
      return new UsernamePasswordAuthenticationToken(username, password);
    }else{
      throw new BadCredentialsException("Username and/or Password invalid !");
    }

  }

  @Override
  public boolean supports(Class<?> authentication) {
    return authentication.equals(UsernamePasswordAuthenticationToken.class);
  }
}
