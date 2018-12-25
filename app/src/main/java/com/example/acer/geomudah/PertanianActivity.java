package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PertanianActivity extends AppCompatActivity {


    public void goToCameronHighland(View view){
        Intent intent = new Intent(getApplicationContext(), CameronHighlandMapsActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanian);
    }
}
