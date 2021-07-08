package com.example.fitness_for_elderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class congratsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats);
        getSupportActionBar().hide();
        Intent intent = getIntent();

    }

    public void contact(View view){
        Intent intent = new Intent(this, contactActivity.class);
        startActivity(intent);
    }


}