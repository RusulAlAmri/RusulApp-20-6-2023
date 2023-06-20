package com.example.rusulapp_20_6_2023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static int addNotice;
    CardView uploadNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        uploadNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addNotice:
                Intent intent =new Intent(MainActivity.this,uploadNotice.class);
                startActivities(intent);
                break;


    }
}

    private void startActivities(Intent intent) {
    }
}