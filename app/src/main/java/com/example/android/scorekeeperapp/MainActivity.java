package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global variables
    int runTeamA=0;
    int overTeamA=0;
    int wktTeamA=0;
    int runTeamB=0;
    int overTeamB=0;
    int wktTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method for displaying teamA run

    public void displayRunTeamA(int run){
        TextView runView= (TextView) findViewById(R.id.team_a_run);
        runView.setText(String.valueOf(run));
    }

    //method for displaying teamA wicket

    public void displayWktTeamA(int wkt){
        TextView wktView= (TextView) findViewById(R.id.team_a_wkt);
        wktView.setText(String.valueOf(wkt));
    }

    //method for displaying teamA over

    public void displayOverTeamA(int over){
        TextView overView= (TextView) findViewById(R.id.team_a_over);
        overView.setText(String.valueOf(over));
    }




























}
