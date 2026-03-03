package com.franmoyano.FintechProject.service;

import com.franmoyano.FintechProject.entity.User;
import com.franmoyano.FintechProject.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserJpaRepository userJpaRepository;

    public UserService(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userJpaRepository.findById(id);
    }

    public User save(User user) {
        return userJpaRepository.save(user);
    }

    public User update(User user) {
        return userJpaRepository.save(user);
    }

    public void delete(Long id) {
        userJpaRepository.deleteById(id);
    }
}
