package mg.diha_agency_api.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "hotel")
public class Hotel implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long hotelId;

  @NotNull
  private String name;

  @NotNull
  private String location;

  @NotNull
  private String description;

  @NotNull
  private String owner;

  @Column(name = "number_of_rooms",nullable = false)
  private  int numberOfRooms;

  @NotNull
  private  int ratings;

  @NotNull
  private String phone;

  @NotNull
  private String email;

}
