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


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "room")
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(name = "reference",nullable = false,unique = true)
    private String ref;

    private String roomType;

    private Long price;

    private String roomStatus;

    @Column(nullable = true)
    private String startingDateBooking;

    @Column(nullable = true)
    private String endingDateBooking;

    @OneToOne
    @JoinColumn(name = "hotel_id",referencedColumnName = "hotelId")
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "client_id",referencedColumnName = "clientId")
    private Client client;

}
