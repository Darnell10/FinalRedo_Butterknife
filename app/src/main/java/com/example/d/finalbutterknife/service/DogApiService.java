package com.example.d.finalbutterknife.service;

import com.example.d.finalbutterknife.model.Breeds;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by D on 5/13/18.
 */

public interface DogApiService {

    //https://dog.ceo/api/breed/retriever/images/random

    @GET("api/breed/{breed}/images/random")
    Call<Breeds> getBreeds(@Path("breed") String breeds);


}
