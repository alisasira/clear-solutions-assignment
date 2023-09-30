package ua.alisasira.service;

import ua.alisasira.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    User create(User user);

    User update(User user);

    boolean delete(Long id);

    List<User> search(LocalDate from, LocalDate to);

    void reset();
}