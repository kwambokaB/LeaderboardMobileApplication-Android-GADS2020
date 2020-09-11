package com.example.leaderboard.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.leaderboard.models.SkillLeader;
import com.example.leaderboard.repository.LeaderBoardRepository;

import java.util.List;

public class SkillViewModel extends ViewModel {
    private LeaderBoardRepository mLeaderBoardRepository;
    private LiveData<List<SkillLeader>> mSkillLeaders;

    public SkillViewModel() {
        mLeaderBoardRepository = new LeaderBoardRepository();
    }

    public void init() {
        if (this.mSkillLeaders != null) {
            return;
        }
        mSkillLeaders = mLeaderBoardRepository.getSkillLeader();
    }

    public LiveData<List<SkillLeader>> getSkillLeaders() {
        return mSkillLeaders;
    }
}
