package com.cursosdedesarrollo.viewmodelapp;

import android.arch.lifecycle.ViewModel;

/**
 * Created by pepesan on 22/3/18.
 */

public class ScoreViewModel extends ViewModel {
    // Tracks the score for Team A
    public int scoreTeamA = 0;

    // Tracks the score for Team B
    public int scoreTeamB = 0;
}