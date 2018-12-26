package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void goToSecond(View view){
        Intent intent = new Intent(getApplicationContext(), secondActivity.class);

        startActivity(intent);
    }

    public void goToAktiviti(View view){
        Intent intent = new Intent(getApplicationContext(), QuizActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
