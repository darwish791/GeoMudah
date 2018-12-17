package com.example.acer.geomudah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PelanconganActivity extends AppCompatActivity {

    public void goToEkologi(View view){
        Intent intent = new Intent(getApplicationContext(), EkologiActivity.class);

        startActivity(intent);
    }

    public void goToKesihatan(View view){
        Intent intent = new Intent(getApplicationContext(), KesihatanActivity.class);

        startActivity(intent);
    }

    public void goToPendidikan(View view){
        Intent intent = new Intent(getApplicationContext(), PendidikanActivity.class);

        startActivity(intent);
    }

    public void goToBudaya(View view){
        Intent intent = new Intent(getApplicationContext(), BudayaActivity.class);

        startActivity(intent);
    }

    public void goToSukan(View view){
        Intent intent = new Intent(getApplicationContext(), SukanActivity.class);

        startActivity(intent);
    }

    public void goToMICE(View view){
        Intent intent = new Intent(getApplicationContext(), MICEActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelancongan);
    }
}
