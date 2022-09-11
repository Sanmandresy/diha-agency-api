package mg.diha_agency_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping({"/hello","hello_there"})
  public String greet(){
    return "General Kenobi !";
  }

}
