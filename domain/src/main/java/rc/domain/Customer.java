package rc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id; //cnp

    private String name;
    private String firstName;
    private String address;
    private String number;
    private String mailAddress;

    public Customer(String name, String firstName, String address, String number, String mailAddress) {
        this.name = name;
        this.firstName = firstName;
        this.address = address;
        this.number = number;
        this.mailAddress = mailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
