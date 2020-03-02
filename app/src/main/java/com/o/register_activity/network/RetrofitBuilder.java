package com.o.register_activity.network;

import okhttp3.Interceptor;
import com.facebook.stetho.okhttp.StethoInterceptor;
import com.o.register_activity.BuildConfig;
import com.o.register_activity.R;

import java.io.IOException;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

public class RetrofitBuilder {

    private static final String BASE_URL = "sfda";

    private final static OkHttpClient client = buildClient();
    private static Retrofit retrofit;

    private static OkHttpClient buildClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();

                        Request.Builder builder = request.newBuilder()
                                .addHeader("Accept","application/json")
                                .addHeader("Connection", "close");


                        request = builder.build();


                        return chain.proceed(request);

                    }
                });

//        if (BuildConfig.DEBUG){
//            builder.addNetworkInterceptor(new StethoInterceptor()).build();
//        }

        return builder.build();
    }

}
