package zw.co.technoextreme.gads2020leaderboard;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonGADS2020SkilliqApi {

    @GET("skilliq")
    Call<List<Skilliq>> getskilliq();
}
