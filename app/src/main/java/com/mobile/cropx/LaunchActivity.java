package com.mobile.cropx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;


import com.mobile.cropx.R;
import com.mobile.cropx.cardview.MainActivity;



public class LaunchActivity extends AppCompatActivity {
    AppCompatButton button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        button = (AppCompatButton) findViewById(R.id.btn_launch_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(LaunchActivity.this, IntroActivity.class);
                Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
