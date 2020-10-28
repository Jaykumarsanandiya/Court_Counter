package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void points3(View view ){

        if(view.getId() == R.id.button1){
            scoreTeamA+=3;
            displayForTeamA(scoreTeamA);
        }
        else  if (view.getId() == R.id.button11){
            scoreTeamB+=3;
            displayForTeamB(scoreTeamB);
        }


    }
    public void points2(View view ){
        if(view.getId() == R.id.button2){
            scoreTeamA+=2;
            displayForTeamA(scoreTeamA);
        }
        else  if (view.getId() == R.id.button21){
            scoreTeamB+=2;
            displayForTeamB(scoreTeamB);
        }


    }


    public void points1(View view ){
        if(view.getId() == R.id.button3){
            scoreTeamA+=1;
            displayForTeamA(scoreTeamA);
        }
        else  if (view.getId() == R.id.button31){
            scoreTeamB+=1;
            displayForTeamB(scoreTeamB);
        }


    }


    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}