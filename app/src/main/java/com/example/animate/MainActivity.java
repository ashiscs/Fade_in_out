package com.example.animate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View wiew) {

        ImageView bart = (ImageView) findViewById(R.id.bart);
        ImageView homer = (ImageView) findViewById(R.id.homer);

        bart.animate().alpha(0f).setDuration(2000);
        homer.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
