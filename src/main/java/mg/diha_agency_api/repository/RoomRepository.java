package mg.diha_agency_api.repository;

import java.util.List;
import mg.diha_agency_api.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoomRepository extends JpaRepository<Room,Long> {

  @Query("select r from Room r where r.hotel.hotelId = :hotel and r.roomId = :roomId")
  Room getSpecificRoom(@Param("hotel")Long hotelId,@Param("roomId")Long roomId);

  void removeRoomByHotel_HotelIdAndRoomId(Long hotelId, Long roomId);

  List<Room> findRoomsByHotel_HotelId(Long hotelId);


}
