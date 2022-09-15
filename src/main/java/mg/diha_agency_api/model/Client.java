package mg.diha_agency_api.model;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "client")
public class Client implements Serializable {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long clientId;

  @Column(nullable = false,name = "first_name")
  private String firstName;

  @Column(nullable = false,name = "last_name")
  private String lastName;

  @Column(name = "username",unique = true)
  private String username;

  @Column(nullable = false,name = "sex")
  private String gender;

  @Column(nullable = false)
  private String birthdate;

  @Column(nullable = false)
  private String nationality;

  @Column(nullable = false)
  private String address;

  @Column(nullable = false,name = "phone_number")
  private String phone;

  @Column(nullable = false,unique = true)
  private String email;

  @Column(nullable = false)
  private String registrationDate;

  @Column(name = "credit_card_ref",unique = true)
  private String creditCardNumber;

}
