package rc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private long idHotel;
    private String adress;
    private int number;
    private String city;
    private String county;
    private String country;

    public Location(long idHotel, String adress, int number, String city, String county, String country) {
        this.idHotel = idHotel;
        this.adress = adress;
        this.number = number;
        this.city = city;
        this.county = county;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public long getIdHotel() {
        return idHotel;
    }

    public String getAdress() {
        return adress;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setIdHotel(long idHotel) {
        this.idHotel = idHotel;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
