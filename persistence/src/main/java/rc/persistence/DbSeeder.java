package rc.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rc.domain.Hotel;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository){

        this.hotelRepository = hotelRepository;
    }
    @Override
    public void run(String... args) throws Exception {

        Hotel international = new Hotel("International",4,true);
        Hotel ubis = new Hotel("Ubis1",3,false);
        Hotel tulip = new Hotel("Tulipa",4,true);
        Hotel iguana = new Hotel("Iguana",2,true);
        Hotel testComit = new Hotel("test",2,true);

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(testComit);
        hotelList.add(ubis);
        hotelList.add(international);
        hotelList.add(tulip);
        hotelList.add(iguana);

        this.hotelRepository.saveAll(hotelList);
    }
}
