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
        Users u = new Users();
        u.setPassword(md5Convert(users));
        return repository.save(users);
    }

    private String md5Convert(Users users){
        return userCategory(users);
    }

    private String userCategory(Users users){
        String result = "";
        if (users.getUsername().equalsIgnoreCase("PREMIUM")){
             result = "12345";
        } else if (users.getUsername().equalsIgnoreCase("REGULAR")){
             result = "abcde";
        }
        return result;
    }

}
