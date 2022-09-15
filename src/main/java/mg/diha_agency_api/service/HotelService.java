package mg.diha_agency_api.service;

import java.util.List;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Hotel;
import mg.diha_agency_api.repository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HotelService {

  private HotelRepository repository;

  public Hotel getHotelById(Long hotelId) {
    return repository.getHotelByHotelId(hotelId);
  }

  @Transactional
  public Hotel createNewHotel(Hotel newHotel) {
    return repository.save(newHotel);
  }

  @Transactional
  public void deleteHotelById(Long hotelId) {
    repository.removeHotelByHotelId(hotelId);
  }

  public List<Hotel> getHotels() {
    return repository.findAll();
  }

  public List<Hotel> getHotelsByLocation(String location) {
    return repository.getAllHotelsByLocation(location);
  }


  public Hotel updateHotelById(Long id, Hotel updated) {
    Hotel actual = repository.getHotelByHotelId(id);
    actual.setDescription(updated.getDescription());
    actual.setName(updated.getName());
    actual.setLocation(updated.getLocation());
    actual.setPhone(updated.getPhone());
    actual.setEmail(updated.getEmail());
    actual.setRatings(updated.getRatings());
    actual.setOwner(updated.getOwner());
    actual.setNumberOfRooms(updated.getNumberOfRooms());
    return repository.save(actual);
  }


}
