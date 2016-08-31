package com.example.megha.apiimplement;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by megha on 27/08/16.
 */
public class ApiClient {
    private static ApiInterface mService;

    public static ApiInterface getInterface() {
        if (mService == null) {
            Gson gson = new GsonBuilder().create();
            //.excludeFieldsWithModifiers(Modifier.TRANSIENT, Modifier.STATIC)
            //.create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.0.104/api/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            mService = retrofit.create(ApiInterface.class);
        }
        return mService;
    }
}
