package com.horaceneto.WaitListWizard.service;
import com.horaceneto.WaitListWizard.model.User;
import com.horaceneto.WaitListWizard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }



}
