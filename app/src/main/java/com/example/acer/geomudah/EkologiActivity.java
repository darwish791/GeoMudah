package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkologiActivity extends AppCompatActivity {

    public void goToMapsTemenggor(View view){
        Intent intent = new Intent(getApplicationContext(), TasikTemenggorMapsActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekologi);
    }
}
