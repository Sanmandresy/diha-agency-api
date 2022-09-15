package mg.diha_agency_api.service;

import java.util.List;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Room;
import mg.diha_agency_api.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoomService {

  private RoomRepository repository;

  public Room getRoomById(Long hotelId, Long roomId) {
    return repository.getSpecificRoom(hotelId,roomId);
  }

  public List<Room> getRooms(Long hotelId) {
    return repository.findRoomsByHotel_HotelId(hotelId);
  }

  @Transactional
  public void deleteRoomById(Long hotelId, Long roomId) {
    repository.removeRoomByHotel_HotelIdAndRoomId(hotelId,roomId);
  }

  public Room updateRoomById(Long hotelId, Long roomId, Room updated) {
    Room actual = repository.getSpecificRoom(hotelId, roomId);
    actual.setRoomStatus(updated.getRoomStatus());
    actual.setPrice(updated.getPrice());
    actual.setStartingDateBooking(updated.getStartingDateBooking());
    actual.setEndingDateBooking(updated.getEndingDateBooking());
    return repository.save(actual);
  }

}
