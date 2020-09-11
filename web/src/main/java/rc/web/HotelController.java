package rc.web;

import org.hibernate.annotations.Parameter;
import org.springframework.web.bind.annotation.*;
import rc.domain.Hotel;
import rc.persistence.HotelRepository;

import java.util.List;

@RestController
public class HotelController {

    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository){

        this.hotelRepository = hotelRepository;
    }
    @GetMapping("/hotels")
    public List<Hotel>getAll(){

        List<Hotel> hotelList = this.hotelRepository.findAll();

        return hotelList;
    }

    @PutMapping("/addHotel")
    @ResponseBody
    public void addHotel(@RequestParam String name, @RequestParam int classification, @RequestParam boolean isOpen){
        Hotel hotelToAdd = new Hotel(name,classification,isOpen);
        hotelRepository.save(hotelToAdd);

    }

    @PostMapping("/removeHotel")
    public void removeHotel(@RequestParam long id){
        List<Hotel> hotelList = this.hotelRepository.findAll();
        Hotel hotelToRemove = null;
        for (Hotel hotel : hotelList)
        {
            if(hotel.getId() == id)
                hotelToRemove=hotel;
        }
        if(hotelToRemove != null)
            this.hotelRepository.delete(hotelToRemove);
    }
}
