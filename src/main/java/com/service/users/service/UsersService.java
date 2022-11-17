package com.service.users.service;

import com.service.users.entity.Users;
import com.service.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

@Service
public class UsersService {
    @Autowired
    UsersRepository repository;

    public Users saveUser(Users users){
        return repository.save(users);
    }

}
