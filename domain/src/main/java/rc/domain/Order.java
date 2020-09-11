package rc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private long idCustomer;
    private long idHodel;
    private boolean paid;
    private String roomType;
    private long roomNumber;
    private long days;
    private Date startDate;
    private long orderType;

    public Order(long idCustomer, long idHodel, boolean paid, String roomType, long roomNumber, long days, Date startDate, long orderType) {
        this.idCustomer = idCustomer;
        this.idHodel = idHodel;
        this.paid = paid;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.days = days;
        this.startDate = startDate;
        this.orderType = orderType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public long getIdHodel() {
        return idHodel;
    }

    public void setIdHodel(long idHodel) {
        this.idHodel = idHodel;
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
}
