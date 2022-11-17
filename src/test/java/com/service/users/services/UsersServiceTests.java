//package com.service.users.services;
//
//import com.service.users.entity.Users;
//import com.service.users.repository.UsersRepository;
//import com.service.users.service.UsersService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class UsersServiceTests {
//
//    @InjectMocks
//    UsersService usersService;
//
//    @Mock
//    UsersRepository usersRepository;
//
//    Users users = new Users("admin", "12345");
//
//    @Test
//    void testSaveUserServiceTrue(){
//        Mockito.when(usersRepository.save(users)).thenReturn(users);
//        Assertions.assertSame(usersService.saveUser(users), users);
//    }
//
//
//}
