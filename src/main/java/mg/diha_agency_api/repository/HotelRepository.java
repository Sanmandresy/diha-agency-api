package mg.diha_agency_api.repository;

import java.util.List;
import mg.diha_agency_api.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
  Hotel getHotelByHotelId(Long hotelId);

  void removeHotelByHotelId(Long hotelId);

  @Query(value = "select h from Hotel h where lower(h.location) like lower(concat('%',:location," +
      "'%')) ")
  List<Hotel> getAllHotelsByLocation(@Param("location")String location);

}
