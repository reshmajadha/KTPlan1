package com.retro.service.retrofitMicro.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.retro.service.retrofitMicro.dto.User;
import com.retro.service.retrofitMicro.newretro.RepositoryInterface;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;
import java.util.List;
@Service
public class UserServiceImpl {

    private RepositoryInterface service;

    public UserServiceImpl() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .create();

        Gson gson1 = new  GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8083/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addConverterFactory(GsonConverterFactory.create(gson1))
                .build();
        service = retrofit.create(RepositoryInterface.class);
    }

    public List<User> getAll() throws IOException {
        Call<List<User>> retrofitCall = service.getAll();
        Response<List<User>> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }
    public User getUser(int id) throws IOException {
        Call<User> retrofitCall = service.getUserByID(id);
        Response<User> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }

    public User insertUser(User user) throws IOException {
        Call<User> retrofitCall = service.insertUser(user);
        Response<User> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }
    public  String deletebyId(int id)throws IOException{
        Call<String> rertofitCall=service.deleteById(id);
        Response<String> response=rertofitCall.execute();
        if(!response.isSuccessful()){
            throw new IOException(response.errorBody()!=null ?response.errorBody().string():"unknown error");
        }
        return response.body();

    }

}

