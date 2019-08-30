package com.example.recyclercardkel10.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.recyclercardkel10.R;

public class ItemMailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_mail);

        TextView judul = (TextView)findViewById(R.id.tv_judul);
        TextView subjudul = (TextView)findViewById(R.id.tv_subjudul);
        TextView about = (TextView)findViewById(R.id.tv_about);
        TextView waktu = (TextView)findViewById(R.id.tv_clock);
        TextView logo = (TextView)findViewById(R.id.tv_logo);

        String juduls = getIntent().getStringExtra("judul");
        String subjuduls = getIntent().getStringExtra("subjudul");
        String abouts = getIntent().getStringExtra("about");
        String waktus = getIntent().getStringExtra("waktu");
        String logos = getIntent().getStringExtra("logo");

        judul.setText(juduls);
        subjudul.setText(subjuduls);
        about.setText(abouts);
        waktu.setText(waktus);
        logo.setText(logos);

    }
}
