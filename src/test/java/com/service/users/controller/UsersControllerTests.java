//package com.service.users.controller;
//
//import com.service.users.entity.Users;
//import org.junit.jupiter.api.Test;
//import org.springframework.http.MediaType;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//public class UsersControllerTests extends BaseControllerTests{
//
//    Users users = new Users("admin", "12345");
//
//    @Test
//    void testSaveUserTrue() throws Exception {
//        mockMvc.perform(post("/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(users))
//        ).andExpect(status().isCreated())
//                .andDo(print());
//    }
//
//}
