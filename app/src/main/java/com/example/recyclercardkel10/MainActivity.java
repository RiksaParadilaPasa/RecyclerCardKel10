package com.example.recyclercardkel10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclercardkel10.cardview.CardViewActivity;
import com.example.recyclercardkel10.recyclerview.RecyclerActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRecycler = (Button)findViewById(R.id.btn_recycler);
        Button btnCard = (Button)findViewById(R.id.btn_card);

        btnCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, CardViewActivity.class);
                startActivity(inten);
            }
        });

        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(inten);
            }
        });

    }
}
