package tech.gsp.nytimessample.NetwokingLayer;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created on : Jul 28, 2019
 * Author     : Saurabh T
 */
public class RetrofitInstance {

    private static Retrofit retrofit = null;
    public static final String BASE_URL = "https://api.nytimes.com/svc/";

    public static RestApiService getApiService() {
        if (retrofit == null) {

            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(RestApiService.class);

    }

}
