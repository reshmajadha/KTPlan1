package com.retro.service.retrofitMicro;


import com.retro.service.retrofitMicro.dto.User;
import com.retro.service.retrofitMicro.newretro.RepositoryInterface;
import com.retro.service.retrofitMicro.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RetrofitMicroApplicationTest {

    @InjectMocks
    UserServiceImpl userService;
    @Mock
    RepositoryInterface repositoryInterface;

    @Test
    public void insertUsertest()throws Exception{
       int id=1;
       String first_name="Reshma";
       String last_name="Jadhav";
       String email="jadhavreshma999@gmail.com";
       Date date=new Date(2022 / 02 / 8);


    }


//    @Test
//    public void testGeUserByName() throws Exception {
//        String firstName = "Wills";
//        String lastName = "Smith";
//        String returning = //JSON I presume
//
//                UserClient userClientObject = ;//init
//
//        when(client).getUserByName(userClientObject, firstName, lastName)
//                .thenReturn(returning);//define stub call expectation
//
//
//        mockMvc.perform(get("/user-byName").sessionAttr("userClientObject", userClientObject))
//                .andExpect(status().isOk());
//
//    }


    public static User dummyuser(){
        User user=new User();
        user.setId(1);
        user.setFirst_name("Reshma");
        user.setLast_name("Jadhav");
        user.setEmail("jadhavreshma999@gmail.com");
        user.setDate(new Date(2022 / 02 / 8));
        return user;
    }



}
