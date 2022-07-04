package com.retro.service.retrofitMicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetrofitMicroApplication {
    public static void main(String[] args) {
        SpringApplication.run(RetrofitMicroApplication.class, args);
//        try {
//            UserService userService = APIClient.getClient().create(UserService.class);
//            userService.getAll().enqueue(new Callback<List<User>>() {
//                @Override
//                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
//                    try {
//                        if (response.isSuccessful()) {
//                            List<User> users = response.body();
//
//                            for(User user: users){
//                                System.out.println(user);
//                            }
//                            System.out.println("size" + users.size());
//                        }
//                    } catch (Exception e) {
//                        System.err.println(e.getMessage());
//                    }
//                }
//                @Override
//                public void onFailure(Call<List<User>> call, Throwable throwable) {
//                    System.err.println(throwable.getMessage());
//                }
//            });
//        }catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        try {
//            UserService userService = APIClient.getClient().create(UserService.class);
//            userService.getUser(1).enqueue(new Callback<User>() {
//                @Override
//                public void onResponse(Call<User> call, Response<User> response) {
//                    try {
//                        if (response.isSuccessful()) {
//                            User users = response.body();
//                        }
//                    } catch (Exception e) {
//                        System.err.println(e.getMessage());
//                    }
//                }
//                @Override
//                public void onFailure(Call<User> call, Throwable throwable) {
//                    System.err.println(throwable.getMessage());
//                }
//            });
//        }catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
    }
}

