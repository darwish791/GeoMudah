package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondActivity extends AppCompatActivity {

    public void goToPrimer(View view){
        Intent intent = new Intent(getApplicationContext(), PrimerActivity.class);

        startActivity(intent);
    }

    public void goToSekunder(View view){
        Intent intent = new Intent(getApplicationContext(), SekunderActivity.class);

        startActivity(intent);
    }


    public void goToTertier(View view){
        Intent intent = new Intent(getApplicationContext(), TertierActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
