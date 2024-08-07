package data.DTO;

public class User {

    private int ID;
    private String cedula;
    private String name;
    private String lastName;
    private String type;

    public User(String cedula) {
        this.cedula = cedula;
    }

    public User(String cedula, String name, String lastName, String type) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.type = type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("ID=").append(ID);
        sb.append(", cedula='").append(cedula).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


