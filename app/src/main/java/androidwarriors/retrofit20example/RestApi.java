package androidwarriors.retrofit20example;

import java.util.ArrayList;

import androidwarriors.retrofit20example.pojo.Model;
import androidwarriors.retrofit20example.pojo.Weather;
import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by androidwarriors on 12/3/2015.
 */
public interface RestApi {

    @GET("/webapi/GetCorporateList?Key=E60541290A0520121010")
    Call<ArrayList<Weather>> getWheatherReport();
}
