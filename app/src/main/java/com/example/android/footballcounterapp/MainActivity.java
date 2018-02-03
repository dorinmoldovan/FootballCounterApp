package com.example.android.footballcounterapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreUCluj = 0;
    private int scoreCFRCluj = 0;
    private int foulsUCluj = 0;
    private int foulsCFRCluj = 0;

    static final String SCORE_U_CLUJ = "scoreUCLuj";
    static final String SCORE_CFR_CLUJ = "scoreCFRCLuj";
    static final String FOULS_U_CLUJ = "foulsUCLuj";
    static final String FOULS_CFR_CLUJ = "foulsCFRCLuj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
             onRestoreInstanceState(savedInstanceState);
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        displayScoreForUCluj(scoreUCluj);
        displayFoulsForUCluj(foulsUCluj);
        displayScoreForCFRCluj(scoreCFRCluj);
        displayFoulsForCFRCluj(foulsCFRCluj);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(SCORE_U_CLUJ, scoreUCluj);
        savedInstanceState.putInt(SCORE_CFR_CLUJ, scoreCFRCluj);
        savedInstanceState.putInt(FOULS_U_CLUJ, foulsUCluj);
        savedInstanceState.putInt(FOULS_CFR_CLUJ, foulsCFRCluj);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreUCluj = savedInstanceState.getInt(SCORE_U_CLUJ);
        scoreCFRCluj = savedInstanceState.getInt(SCORE_CFR_CLUJ);
        foulsUCluj = savedInstanceState.getInt(FOULS_U_CLUJ);
        foulsCFRCluj = savedInstanceState.getInt(FOULS_CFR_CLUJ);
    }

    public void reset(View v) {
        scoreUCluj = 0;
        scoreCFRCluj = 0;
        foulsUCluj = 0;
        foulsCFRCluj = 0;
        displayScoreForUCluj(scoreUCluj);
        displayFoulsForUCluj(foulsUCluj);
        displayScoreForCFRCluj(scoreCFRCluj);
        displayFoulsForCFRCluj(foulsCFRCluj);
    }

    public void displayScoreForUCluj(int score) {
        TextView scoreView = (TextView) findViewById(R.id.u_cluj_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneGoalForUCluj(View v) {
        scoreUCluj = scoreUCluj + 1;
        displayScoreForUCluj(scoreUCluj);
    }

    public void displayFoulsForUCluj(int score) {
        TextView scoreView = (TextView) findViewById(R.id.u_cluj_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneFoulForUCluj(View v) {
        foulsUCluj = foulsUCluj + 1;
        displayFoulsForUCluj(foulsUCluj);
    }

    public void displayScoreForCFRCluj(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cfr_cluj_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneGoalForCFRCluj(View v) {
        scoreCFRCluj = scoreCFRCluj + 1;
        displayScoreForCFRCluj(scoreCFRCluj);
    }

    public void displayFoulsForCFRCluj(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cfr_cluj_fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneFoulForCFRCluj(View v) {
        foulsCFRCluj = foulsCFRCluj + 1;
        displayFoulsForCFRCluj(foulsCFRCluj);
    }

}
