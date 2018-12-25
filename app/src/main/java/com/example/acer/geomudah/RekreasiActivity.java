package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RekreasiActivity extends AppCompatActivity {

    public void goToPulauSipadan(View view){
        Intent intent = new Intent(getApplicationContext(), PulauSipadanMapsActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekreasi);
    }
}
