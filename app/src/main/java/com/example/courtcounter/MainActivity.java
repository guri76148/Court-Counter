package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * For Team A
     */

    /**
     * display score for team A
     */

    public void displayForTeamA(int a){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(a));
    }

    /**
     * display when free throe button is clicked
     */
    public void addOnePointForTeamA(View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display when +2 Points button is clicked
     */
    public void addTwoPointForTeamA(View v){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display when +3 Points button is clicked
     */

    public void addThreePointForTeamA(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * For Team B
     */


    /**
     * display score for team B
     */

    public void displayForTeamB(int b){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(b));
    }

    /**
     * display when free throe button is clicked
     */
    public void addOnePointForTeamB(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display when +2 Points button is clicked
     */
    public void addTwoPointForTeamB(View v){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display when +3 Points button is clicked
     */

    public void addThreePointForTeamB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * when REST button is clicked
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
