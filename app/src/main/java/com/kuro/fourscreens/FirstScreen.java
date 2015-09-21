package com.kuro.fourscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void goToSecondScreen(View view){
        Intent goSecondIntent = new Intent(this, SecondScreen.class);
        startActivity(goSecondIntent);

    }
}
