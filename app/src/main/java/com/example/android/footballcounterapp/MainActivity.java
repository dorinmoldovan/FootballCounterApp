package com.example.android.footballcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreUCluj = 0;
    int scoreCFRCluj = 0;
    int foulsUCluj = 0;
    int foulsCFRCluj = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForUCluj(scoreUCluj);
        displayFoulsForUCluj(foulsUCluj);
        displayScoreForCFRCluj(scoreCFRCluj);
        displayFoulsForCFRCluj(foulsCFRCluj);
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
