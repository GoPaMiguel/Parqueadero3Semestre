package data.DAO;

import data.DTO.User;

import java.util.List;

public interface UserDao {
    public List<User> list();
    public void insert(User user);
    public void update(User user);
    public void delete(User user);
    }
