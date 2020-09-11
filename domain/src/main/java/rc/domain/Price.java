package rc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    String idRoom;
    String offer;
    boolean price;

    public Price(String offer, boolean price) {
        this.offer = offer;
        this.price = price;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public boolean isPrice() {
        return price;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }
}
