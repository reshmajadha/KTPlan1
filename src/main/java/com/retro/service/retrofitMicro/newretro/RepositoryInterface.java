package com.retro.service.retrofitMicro.newretro;

import com.retro.service.retrofitMicro.dto.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface RepositoryInterface {

    @POST("insertUser")
    public  Call<User> insertUser(@Body User user);

    @GET("user/{id}")
    public Call<User> getUserByID(@Path("id") long id);

    @GET("allUser")
    public Call<List<User>> getAll();

    @DELETE("deleteById/{id}")
    public  Call<String> deleteById(@Path("id") int id);

}