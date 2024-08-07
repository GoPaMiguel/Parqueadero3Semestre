package data.DTO;

public class Vehicle {
    private int ID;
    private String plate;
    private String type;

    public Vehicle(String plate) {
        this.plate = plate;
    }

    public Vehicle(String plate, String type) {
        this.plate = plate;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("ID=").append(ID);
        sb.append(", plate='").append(plate).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
