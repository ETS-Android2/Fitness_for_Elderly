package com.example.fitness_for_elderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class exerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        getSupportActionBar().hide();
        Intent intent = getIntent();
    }

    public void congrats(View view) {
        Intent intent = new Intent(this, congratsActivity.class);
        startActivity(intent);
    }

    public void contact(View view){
        Intent intent = new Intent(this, contactActivity.class);
        startActivity(intent);
    }
}