package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    void delete(Long index);

    void update(User user);

    User findById(Long id);

    List<User> findAll();

}
