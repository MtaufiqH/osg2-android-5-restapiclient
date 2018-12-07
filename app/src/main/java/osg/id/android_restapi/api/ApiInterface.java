package osg.id.android_restapi.api;

import java.util.List;

import osg.id.android_restapi.model.Users;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/users")
    Call<List<Users>> getListUser();

}



