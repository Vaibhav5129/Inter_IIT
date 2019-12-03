package com.example.android.inter_iit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView Volleyball = findViewById(R.id.Volleyball);
        Volleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    Intent intent =new Intent(MainActivity.this,NewActivity.class);
                    startActivity(intent);
                }
            }
        });

        final CardView Badminton = findViewById(R.id.Badminton);
        Badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Badminton.class);
                startActivity(intent);
            }
        });
    }
}
