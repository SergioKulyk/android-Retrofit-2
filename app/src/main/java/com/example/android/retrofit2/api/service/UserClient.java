package com.example.android.retrofit2.api.service;

import com.example.android.retrofit2.api.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Sergey Kulyk on 14.05.2018.
 */

public interface UserClient {

    @POST("user")
    Call<User> createAccount(@Body User user);
}
