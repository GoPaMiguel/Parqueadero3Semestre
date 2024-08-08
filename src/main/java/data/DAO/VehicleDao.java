package data.DAO;

import data.DTO.Vehicle;

import java.util.List;

public interface VehicleDao {
    public List<Vehicle> list();
    public void insert(Vehicle vehicle);
    public void update(Vehicle vehicle);
    public void delete(Vehicle vehicle);
}
