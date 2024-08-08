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

    public Service(String cedula, String plate, Date start, Date wayOut) {
        this.cedula = cedula;
        this.plate = plate;
        this.start = start;
        this.wayOut = wayOut;
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

    public String getPlaca() {
        return plate;
    }

    public void setPlaca(String plate) {
        this.plate = plate;
    }

    public Date getWayOut() {
        return wayOut;
    }

    public void setWayOut(Date wayOut) {
        this.wayOut = wayOut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("ID=").append(ID);
        sb.append(", cedula='").append(cedula).append('\'');
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", start=").append(start);
        sb.append(", wayOut=").append(wayOut);
        sb.append('}');
        return sb.toString();
    }
}
