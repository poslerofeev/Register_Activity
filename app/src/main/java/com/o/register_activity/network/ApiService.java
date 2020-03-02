package com.o.register_activity.network;


import com.o.register_activity.entities.AccessToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {


    @POST("register")
    @FormUrlEncoded
    Call<AccessToken>register(@Field("name") String name, @Field("email") String email, @Field("password") String password, @Field("password_conformation") String password_confirmation);


}
