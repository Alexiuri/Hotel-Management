package rc.persistence;

import java.util.Date;

public class OrderInfoDto {

    private long cnp;
    private String name;
    private String firstName;
    private String address;
    private String number;
    private String mailAddress;
    private long idHotel;
    private String nameHotel;
    private int classificationOfHotel;
    private String hotelAdress;
    private int numberAdress;
    private String city;
    private String county;
    private String country;
    private boolean paid;
    private String roomType;
    private long roomNumber;
    private long days;
    private Date startDate;
    private long orderType;
    private long price;

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(long idHotel) {
        this.idHotel = idHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public int getClassificationOfHotel() {
        return classificationOfHotel;
    }

    public void setClassificationOfHotel(int classificationOfHotel) {
        this.classificationOfHotel = classificationOfHotel;
    }

    public String getHotelAdress() {
        return hotelAdress;
    }

    public void setHotelAdress(String hotelAdress) {
        this.hotelAdress = hotelAdress;
    }

    public int getNumberAdress() {
        return numberAdress;
    }

    public void setNumberAdress(int numberAdress) {
        this.numberAdress = numberAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long getDays() {
        return days;
    }

    public void setDays(long days) {
        this.days = days;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public long getOrderType() {
        return orderType;
    }

    public void setOrderType(long orderType) {
        this.orderType = orderType;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
