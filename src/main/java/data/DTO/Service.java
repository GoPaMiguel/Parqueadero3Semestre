package data.DTO;

import java.util.Date;

public class Service {
    private int ID;
    private String cedula;
    private String plate;
    private Date start;
    private Date wayOut;
    private double priceHour;
    private double totalHours;
    private double totalPrice;


    public Service(int ID) {
        this.ID = ID;
    }

    public Service(String cedula, String plate, Date start, Date wayOut, double priceHour, double totalHours, double totalPrice) {
        this.cedula = cedula;
        this.plate = plate;
        this.start = start;
        this.wayOut = wayOut;
        this.priceHour = priceHour;
        this.totalHours = totalHours;
        this.totalPrice = totalPrice;
    }

    public int getID() {
        return ID;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getWayOut() {
        return wayOut;
    }

    public void setWayOut(Date wayOut) {
        this.wayOut = wayOut;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("ID=").append(ID);
        sb.append(", cedula='").append(cedula).append('\'');
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", start=").append(start);
        sb.append(", wayOut=").append(wayOut);
        sb.append(", priceHour=").append(priceHour);
        sb.append(", totalHours=").append(totalHours);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append('}');
        return sb.toString();
    }
}
