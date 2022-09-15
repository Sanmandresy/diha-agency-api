package mg.diha_agency_api.security;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
@Slf4j
public class SecurityConf extends WebSecurityConfigurerAdapter {

  private CustomAuthProvider authProvider;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authProvider);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.
        authorizeRequests()
        .antMatchers("/**").permitAll()
        .antMatchers(HttpMethod.GET,"/hello","hello_there").permitAll()
        .antMatchers(HttpMethod.POST,"/clients").permitAll()
        .antMatchers(HttpMethod.GET,"/clients/*").permitAll()
        .antMatchers(HttpMethod.GET,"/clients").permitAll()
        .antMatchers(HttpMethod.GET,"/hotels").permitAll()
        .antMatchers(HttpMethod.POST,"/hotels").permitAll()
        .antMatchers(HttpMethod.POST,"/transactions").permitAll()
        .and()
        .formLogin().disable()
        .cors()
        .and()
        .logout().disable()
        .csrf().disable();
  }
}
