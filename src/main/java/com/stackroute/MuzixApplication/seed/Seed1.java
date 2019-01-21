package com.stackroute.MuzixApplication.seed;

import com.stackroute.MuzixApplication.domain.User;
import com.stackroute.MuzixApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seed1 implements CommandLineRunner {
    UserRepository userRepository;

    @Autowired
    public Seed1(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(1,"surbhi","aaaa"));
        userRepository.save(new User(2,"abc","xyz"));
    }
}
