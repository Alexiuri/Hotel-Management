package rc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rc.domain.Customer;
import rc.domain.Location;
import rc.persistence.CustomerRepository;
import rc.persistence.LocationRepository;

import java.util.List;

@RestController
public class LocationController {

    LocationRepository locationRepository;

    public LocationController(LocationRepository locationRepository){
        this.locationRepository= locationRepository;
    }

    @GetMapping("/locations")
    public List<Location> getAll(){

        List<Location> locationList = this.locationRepository.findAll();

        return locationList;
    }
}
