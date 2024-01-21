package com.myproject.hotelreservationsoftware.service;

import com.myproject.hotelreservationsoftware.model.User;
import java.util.List;

public interface UserServiceInterface {
    User registerUser(User user);

    List<User> getUsers();

    void deleteUser(String email);

    User getUser(String email);
}
