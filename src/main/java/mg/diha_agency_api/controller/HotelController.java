package mg.diha_agency_api.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Hotel;
import mg.diha_agency_api.service.HotelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
public class HotelController {

  private HotelService service;

  @GetMapping("/hotels")
  public List<Hotel> getHotels() {
    return service.getHotels();
  }

  @GetMapping("/hotels/locations/{location}")
  public List<Hotel> getHotelsByLocation(@PathVariable("location")String location ) {
    return service.getHotelsByLocation(location);
  }

  @GetMapping("/hotels/{hotel_id}")
  public Hotel getHotelById(@PathVariable("hotel_id")Long hotelId){
    return service.getHotelById(hotelId);
  }

  @DeleteMapping("/hotels/{hotel_id}")
  public String deleteHotelById(@PathVariable("hotel_id")Long hotelId){
    service.deleteHotelById(hotelId);
    return "Hotel deleted !";
  }

  @PostMapping("/hotels")
  public Hotel createNewHotel(@RequestBody Hotel newHotel){
    return service.createNewHotel(newHotel);
  }

  @PutMapping("/hotels/{hotel_id}")
  public Hotel updateHotelById(
      @PathVariable("hotel_id")Long hotelId,
      @RequestBody Hotel updatedHotel){
    return service.updateHotelById(hotelId,updatedHotel);
  }


}
