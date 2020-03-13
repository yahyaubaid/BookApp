package com.mudamendunia.bookapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class see_all extends AppCompatActivity {

    LinearLayout slide1, slide2, slide3, slide4, slide5, slide6, slide7, slide8, slide9, slide10;
    LinearLayout slide11, slide12, slide13, slide14, slide15, slide16, slide17, slide18, slide19, slide20;
    LinearLayout slide21, slide22, slide23, slide24, slide25, slide26, slide27, slide28, slide29, slide30, slide31, slide32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all);

        slide1 = findViewById(R.id.slide1);
        slide2 = findViewById(R.id.slide2);
        slide3 = findViewById(R.id.slide3);
        slide4 = findViewById(R.id.slide4);
        slide5 = findViewById(R.id.slide5);
        slide6 = findViewById(R.id.slide6);
        slide7 = findViewById(R.id.slide7);
        slide8 = findViewById(R.id.slide8);
        slide9 = findViewById(R.id.slide9);
        slide10 = findViewById(R.id.slide10);
        slide11 = findViewById(R.id.slide11);
        slide12 = findViewById(R.id.slide12);

        slide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide1 = new Intent(see_all.this, pdf0.class);
                startActivity(goslide1);
            }
        });

        slide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide3 = new Intent(see_all.this, artho.class);
                startActivity(goslide3);
            }
        });

        slide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide2 = new Intent(see_all.this, pdf1.class);
                startActivity(goslide2);
            }
        });

        slide4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide4 = new Intent(see_all.this, chor.class);
                startActivity(goslide4);
            }
        });

        slide5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide5 = new Intent(see_all.this, echi.class);
                startActivity(goslide5);
            }
        });

        slide6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide6 = new Intent(see_all.this, enzim.class);
                startActivity(goslide6);
            }
        });

        slide7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide7 = new Intent(see_all.this, fungi.class);
                startActivity(goslide7);
            }
        });

        slide8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide8 = new Intent(see_all.this, jaringan.class);
                startActivity(goslide8);
            }
        });

        slide9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide9 = new Intent(see_all.this, kata.class);
                startActivity(goslide9);
            }
        });

        slide10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide10 = new Intent(see_all.this, makan.class);
                startActivity(goslide10);
            }
        });

        slide11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide11 = new Intent(see_all.this, moll.class);
                startActivity(goslide11);
            }
        });

        slide12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goslide12 = new Intent(see_all.this, monera.class);
                startActivity(goslide12);
            }
        });
    }
}
