package com.cursosdedesarrollo.viewmodelapp;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScoreViewModel mViewModel;
    private TextView teamB;
    private TextView teamA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);
        teamA=(TextView)findViewById(R.id.scoreA);
        teamB=(TextView)findViewById(R.id.scoreB);
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

    private void displayForTeamA(int scoreTeamA) {
        teamA.setText(""+scoreTeamA);
    }
    private void displayForTeamB(int scoreTeamB) {
        teamB.setText(""+scoreTeamB);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1;
            displayForTeamA(mViewModel.scoreTeamA);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
