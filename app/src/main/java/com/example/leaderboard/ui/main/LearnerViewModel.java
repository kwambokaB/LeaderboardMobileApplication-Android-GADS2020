package com.example.leaderboard.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.leaderboard.models.TopLearner;
import com.example.leaderboard.repository.LeaderBoardRepository;

import java.util.List;

public class LearnerViewModel extends ViewModel {
    private LeaderBoardRepository mLeaderBoardRepository;
    private LiveData<List<TopLearner>> mTopLearners;

    public LearnerViewModel() {
        mLeaderBoardRepository = new LeaderBoardRepository();
    }

    public void init() {
        if (this.mTopLearners != null) {
            return;
        }
        mTopLearners = mLeaderBoardRepository.getTopLearner();
    }

    public LiveData<List<TopLearner>> getTopLearner() {
        return mTopLearners;
    }
}
