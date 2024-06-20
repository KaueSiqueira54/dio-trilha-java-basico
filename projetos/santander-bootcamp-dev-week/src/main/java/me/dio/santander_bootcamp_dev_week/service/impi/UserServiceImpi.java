package me.dio.santander_bootcamp_dev_week.service.impi;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.santander_bootcamp_dev_week.dominio.model.User;
import me.dio.santander_bootcamp_dev_week.dominio.repository.UserRepository;
import me.dio.santander_bootcamp_dev_week.service.UserService;

@Service
public class UserServiceImpi implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new );
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number already exists");
        }
        return userRepository.save(userToCreate);
    }

}
