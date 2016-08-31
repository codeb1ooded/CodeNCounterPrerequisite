package com.example.megha.apiimplement;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by megha on 27/08/16.
 */
public interface ApiInterface {

    @GET("api.php")
    Call<StudentData> getMySearch(@Query("action") String item);

    @POST("api_post.php")
    Call<StudentData> postData(@Body StudentData.Student student);

}
