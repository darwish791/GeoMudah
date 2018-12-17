package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BudayaActivity extends AppCompatActivity {

    public void goToKotaAFamosa(View view){
        Intent intent = new Intent(getApplicationContext(), KotaAFamosaMapsActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);
    }
}
