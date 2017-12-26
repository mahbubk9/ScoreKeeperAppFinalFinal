package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global variables
    int runTeamA=0;
    int  overTeamA=0;
    int ballTeamA=0;
    int wktTeamA=0;
    int runTeamB=0;
    int overTeamB=0;
    int ballTeamB=0;
    int wktTeamB=0;
    static final String TEAM_A_RUN = "0";
    static final String TEAM_A_OVER = "0";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(TEAM_A_RUN, runTeamA);
        savedInstanceState.putInt(TEAM_A_OVER, overTeamA);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        runTeamA = savedInstanceState.getInt(TEAM_A_RUN);
        overTeamA = savedInstanceState.getInt(TEAM_A_OVER);
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

    public void displayBallTeamA(int ball){
        TextView ballView= (TextView) findViewById(R.id.team_a_ball);
        ballView.setText(String.valueOf(ball));
    }

    public void oneRunTeamA(View view){



        runTeamA=runTeamA+1;
        displayRunTeamA(runTeamA);
        String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";
        displayResult(commentry);
    }

    public void bndryTeamA(View view){

        runTeamA=runTeamA+4;
        displayRunTeamA(runTeamA);
        String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";
        displayResult(commentry);
         }
    public void sixTeamA(View view){

        runTeamA=runTeamA+6;
        displayRunTeamA(runTeamA);
        String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";
        displayResult(commentry);
    }


    public void addBallTeamA(View view){

        if(overTeamA>19){
            //String finalResult="Team A Batting Finished";
            overTeamA=20;
            ballTeamA=0;
            String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";


            displayResult(commentry);
        }

        if(overTeamA<=19){



            if (ballTeamA<6){
            ballTeamA=ballTeamA+1;

            }
            if(ballTeamA>5){
            ballTeamA=0;
            overTeamA=overTeamA+1;
            }




        }

        displayOverTeamA(overTeamA);
        displayBallTeamA(ballTeamA);
        String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";
        displayResult(commentry);
    }

    public void addWktTeamA(View view) {

        if (wktTeamA < 10) {

            wktTeamA = wktTeamA + 1;
            displayWktTeamA(wktTeamA);
            String commentry="TeamA Scored "+runTeamA+ " for "+wktTeamA+ " in "+overTeamA+"."+ballTeamA+" Overs.";
            displayResult(commentry);
        }

        if (wktTeamA >9) {
            String finalResult="Team A All Out";
            wktTeamA = 10;
            displayWktTeamA(wktTeamA);
            displayResult(finalResult);
        }
    }



    //method for displaying teamB run

    public void displayRunTeamB(int run){
        TextView runView= (TextView) findViewById(R.id.team_b_run);
        runView.setText(String.valueOf(run));
    }



    //method for displaying teamB wicket

    public void displayWktTeamB(int wkt){
        TextView wktView= (TextView) findViewById(R.id.team_b_wkt);
        wktView.setText(String.valueOf(wkt));
    }

    //method for displaying teamB over

    public void displayOverTeamB(int over){
        TextView overView= (TextView) findViewById(R.id.team_b_over);
        overView.setText(String.valueOf(over));
    }

    public void displayBallTeamB(int ball){
        TextView ballView= (TextView) findViewById(R.id.team_b_ball);
        ballView.setText(String.valueOf(ball));
    }

    public void oneRunTeamB(View view){

        runTeamB=runTeamB+1;
        String commentry="TeamB Scored "+runTeamB+ " for "+wktTeamB+ " in "+overTeamB+" Overs.";
        displayRunTeamB(runTeamB);
        displayResultB(commentry);


        if(runTeamB>runTeamA){
            String result="Team B Won The Game.";
            displayFinalResult(result);



        }
        if ((runTeamA==runTeamB) && (overTeamB>20)){

            String result=" The Game is Drawn!";
            displayFinalResult(result);


        }


    }

    public void bndryTeamB(View view){



        runTeamB=runTeamB+4;
        displayRunTeamB(runTeamB);
        String commentry="TeamB Scored "+runTeamB+ " for "+wktTeamB+ " in "+overTeamB+" Overs.";
        displayResultB(commentry);
        if(runTeamB>runTeamA){
            String result="Team B Won The Game.";
            displayFinalResult(result);



        }
        if ((runTeamA==runTeamB) && (overTeamB>19)){

            String result=" The Game is Drawn!";
            displayFinalResult(result);


        }
    }
    public void sixTeamB(View view){



        runTeamB=runTeamB+6;
        displayRunTeamB(runTeamB);
        String commentry="TeamB Scored "+runTeamB+ " for "+wktTeamB+ " in "+overTeamB+" Overs.";
        displayResultB(commentry);

        if(runTeamB>runTeamA){
            String result="Team B Won The Game.";
            displayFinalResult(result);



        }
        if ((runTeamA==runTeamB) && (overTeamB>19)){

            String result=" The Game is Drawn!";
            displayFinalResult(result);


        }
    }


    public void addBallTeamB(View view) {


        if (overTeamB < 20) {


            if (ballTeamB < 6) {
                ballTeamB = ballTeamB + 1;

            }
            if (ballTeamB > 5 && overTeamB < 20) {
                ballTeamB = 0;
                overTeamB = overTeamB + 1;
            }


            displayOverTeamB(overTeamB);
            displayBallTeamB(ballTeamB);
            String commentry = "TeamB Scored " + runTeamB + " for " + wktTeamB + " in " + overTeamB + "." + ballTeamB + " Overs.";
            displayResultB(commentry);

            if (overTeamB == 20) {
                overTeamB = 20;
                ballTeamB = 0;
                String commentryfinal = "TeamB Scored " + runTeamB + " for " + wktTeamB + " in " + overTeamB + "." + ballTeamB + " Overs.";
                displayResultB(commentryfinal);
                if (runTeamA > runTeamB) {
                    String result = "Team A Won The Game!";
                    displayFinalResult(result);


                }
                if (runTeamB > runTeamA) {
                    String result = "Team B Won The Game!";
                    displayFinalResult(result);


                }
                if (runTeamA == runTeamB) {
                    String result = "The Game is Drawn!";
                    displayFinalResult(result);


                }


            }
        }
    }

    public void addWktTeamB(View view){
        if (wktTeamB < 10) {

            wktTeamB = wktTeamB + 1;
            displayWktTeamB(wktTeamB);
            String commentry="TeamB Scored "+runTeamB+ " for "+wktTeamB+ " in "+overTeamB+"."+ballTeamB+" Overs.";
            displayResultB(commentry);
        }

        if (wktTeamB > 9) {
            String finalResult="Team B All Out!";
            wktTeamB = 10;
            displayWktTeamB(wktTeamB);
            displayResultB(finalResult);
            if(runTeamA>runTeamB){
                String result="Team A Won The Game!";
                displayFinalResult(result);


            }
            if(runTeamB>runTeamA){
                String result="Team B Won The Game!";
                displayFinalResult(result);



            }
            if (runTeamA==runTeamB){
                String result="The Game is Drawn!";
                displayFinalResult(result);

            }
        }



    }

    public void displayResult(String result) {

        TextView resultView = (TextView) findViewById(R.id.resultA);
        resultView.setText(result);

    }


    public void displayResultB(String result){

        TextView resultView = (TextView) findViewById(R.id.resultB);
        resultView.setText(result);

    }

    public void displayFinalResult(String result){

        TextView resultView = (TextView) findViewById(R.id.finalResult);
        resultView.setText(result);

    }




    //Reset View

    public void reset(View view){
        runTeamA=0;
        wktTeamA=0;
        overTeamA=0;
        ballTeamA=0;
        runTeamB=0;
        wktTeamB=0;
        overTeamB=0;
        ballTeamB=0;
        displayRunTeamA(runTeamA);
        displayWktTeamA(wktTeamA);
        displayOverTeamA(overTeamA);
        displayBallTeamA(ballTeamA);
        displayRunTeamB(runTeamB);
        displayWktTeamB(wktTeamB);
        displayOverTeamB(overTeamB);
        displayBallTeamB(ballTeamB);
        displayResult("");
        displayResultB("");
        displayFinalResult("");



    }










}