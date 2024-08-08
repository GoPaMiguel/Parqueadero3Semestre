package data.DAO;

import data.DTO.Service;

import java.util.List;

public interface ServiceDao {
    public List<Service> list();
    public void insert(Service service);
    public void update(Service service);
    public void delete(Service service);
}
