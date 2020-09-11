package zw.co.technoextreme.gads2020leaderboard;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonGADS2020HoursApi {

    @GET("hours")
    Call<List<Hours>> getHours();
}
