package mg.diha_agency_api.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Hotel;
import mg.diha_agency_api.model.Room;
import mg.diha_agency_api.service.RoomService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RoomController {

  private RoomService service;

  @GetMapping("/hotels/{hotel_id}/rooms")
  public List<Room> getRooms(@PathVariable("hotel_id")Long hotelId) {
    return service.getRooms(hotelId);
  }

  @GetMapping("/hotels/{hotel_id}/rooms/{room_id}")
  public Room getRoomById(
      @PathVariable("hotel_id")Long hotelId,
      @PathVariable("room_id")Long roomId) {
    return service.getRoomById(hotelId, roomId);
  }

  @PutMapping("/hotels/{hotel_id}/rooms/{room_id}")
  public Room updateRoomById(
      @PathVariable("hotel_id")Long hotelId,
      @PathVariable("room_id")Long roomId,
      @RequestBody Room updatedRoom) {
    return service.updateRoomById(hotelId,roomId,updatedRoom);
  }

  @DeleteMapping("/hotels/{hotel_id}/rooms/{room_id}")
  public String deleteRoomById(
      @PathVariable("hotel_id")Long hotelId,
      @PathVariable("room_id")Long roomId) {
    service.deleteRoomById(hotelId,roomId);
    return "Room deleted !";
  }

}
