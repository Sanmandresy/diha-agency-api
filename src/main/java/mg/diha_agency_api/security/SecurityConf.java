package mg.diha_agency_api.security;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mg.diha_agency_api.service.UserDetailService;
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
  private UserDetailService detailService;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.authenticationProvider(authProvider).userDetailsService(detailService);
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.
        csrf().disable()
        .cors()
        .and()
        .authorizeRequests()
        .antMatchers(HttpMethod.GET,"/hello","hello_there").permitAll()
        .antMatchers(HttpMethod.POST,"admin").permitAll()
        .antMatchers(HttpMethod.POST,"/clients").authenticated()
        .antMatchers(HttpMethod.GET,"/clients/*").authenticated()
        .antMatchers(HttpMethod.GET,"/clients").authenticated()
        .antMatchers(HttpMethod.GET,"/hotels").authenticated()
        .antMatchers(HttpMethod.POST,"/hotels").authenticated()
        .antMatchers(HttpMethod.POST,"/transactions").authenticated()
        .and()
        .formLogin().disable()
        .logout().disable()
        .httpBasic()
    ;
  }
}
