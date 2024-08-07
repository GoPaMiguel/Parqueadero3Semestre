package data.DTO;

import java.util.Date;

public class Service {
    private int ID;
    private String cedula;
    private String placa;
    private Date start;
    private Date wayOut;

    public Service(int ID) {
        this.ID = ID;
    }

    public Service(String cedula, String placa, Date start, Date wayOut) {
        this.cedula = cedula;
        this.placa = placa;
        this.start = start;
        this.wayOut = wayOut;
    }

    public Service(int ID, String cedula, String placa, Date start, Date wayOut) {
        this.ID = ID;
        this.cedula = cedula;
        this.placa = placa;
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
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", start=").append(start);
        sb.append(", wayOut=").append(wayOut);
        sb.append('}');
        return sb.toString();
    }
}
