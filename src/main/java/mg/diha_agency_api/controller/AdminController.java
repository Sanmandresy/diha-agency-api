package mg.diha_agency_api.controller;

import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Admin;
import mg.diha_agency_api.service.AdminService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class AdminController {

  private AdminService service;

  @PostMapping("/admin")
  public Admin createNewAdmin(@RequestBody Admin toCreate) {
    return service.createNewAdmin(toCreate);
  }

}
