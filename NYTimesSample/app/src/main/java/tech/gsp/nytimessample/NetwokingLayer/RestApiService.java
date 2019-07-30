package tech.gsp.nytimessample.NetwokingLayer;


import retrofit2.Call;
import retrofit2.http.GET;
import tech.gsp.nytimessample.Model.BlogWrapper;

/**
 * Created on : Jul 28, 2019
 * Author     : Saurabh T
 */
public interface RestApiService {


    @GET("mostpopular/v2/viewed/1.json?api-key=Io0ru9iGrPRU1sdIIMc9U2daTyfDmSJs")
    Call<BlogWrapper> getMostPopularBlog();

}
