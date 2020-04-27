package com.example.challenge1_ariesgurl.api.services;


import org.rina.myrecipe.api.models.AppVersion;
import org.rina.myrecipe.api.models.RebrandlyRequest;
import org.rina.myrecipe.api.models.ResponseData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface{
    @GET("/")
    Call<AppVersion> getAppVersion();

    @POST("/v1/links")
    Call<ResponseData> doRebrand(@Query("apikey") String apikey, @Body RebrandlyRequest destination);

    @GET("/v1/links")
    Call<List<ResponseData>> getRebrand(@Query("apikey") String data);


}
