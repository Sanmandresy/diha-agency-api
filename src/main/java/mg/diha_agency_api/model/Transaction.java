package mg.diha_agency_api.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Getter
@Setter
@Table(name = "transaction")
public class Transaction implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long transactionId;

  @OneToOne
  @JoinColumn(name = "client",referencedColumnName = "clientId")
  private Client client;

  @Column(nullable = false,name = "credit_ref",unique = true)
  private String clientCardRef;

  private int amount;

  @Column(name = "transaction_date",nullable = false)
  private String transactionDate;

}
