package me.dio.santander_bootcamp_dev_week.service;

import me.dio.santander_bootcamp_dev_week.dominio.model.User;

public interface UserService {

    User findById(Long id);
    
    User create(User userToCreate);
}
