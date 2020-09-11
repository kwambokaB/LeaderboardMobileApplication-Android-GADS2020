package com.example.leaderboard.api;

import com.example.leaderboard.models.SkillLeader;
import com.example.leaderboard.models.TopLearner;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public class LeaderBoardApi {
    @GET("/api/skilliq")
    Call<List<SkillLeader>> getSkillLeader() {

        return null;
    }

    @GET("/api/hours")
    Call<List<TopLearner>> getTopLearner() {
        return null;
    }

    @FormUrlEncoded
    @POST("1FAIpQLSf9d1TcNU6zc6KR8bSEM41Z1g1zl35cwZr2xyjIhaMAz8WChQ/formResponse")
    Call<Void> submitApp(@Field("entry.1877115667") String firstName,
                         @Field("entry.2006916086") String lastName,
                         @Field("entry.1824927963") String emailAddress,
                         @Field("entry.284483984") String githubLink) {
        return null;
    }
}
