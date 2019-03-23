package com.example.puzzlegame;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img[] = new ImageView[10];
    int mode = 0;
    int blank = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resize();
        init();
        mode = 1;
        rendom();
        clicklistener();
    }

    private void resize() {

        blank = 3;
    }

    private void clicklistener() {
        img[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 2 || blank == 4) {
                    Drawable drawable=img[1].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[1].setImageResource(R.drawable.blank);
                    blank = 1;
                }
            }
        });
        img[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 1 || blank == 3 || blank == 5) {
                    Drawable drawable=img[2].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[2].setImageResource(R.drawable.blank);
                    blank = 2;
                }
            }
        });
        img[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==2 || blank==6){
                    Drawable drawable=img[3].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[3].setImageResource(R.drawable.blank);
                    blank=3;
                }
            }
        });
        img[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==1 || blank==5 || blank==7){
                    Drawable drawable=img[4].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[4].setImageResource(R.drawable.blank);
                    blank=4;
                }
            }
        });
        img[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==2 || blank==4 || blank==6 || blank==8){
                    Drawable drawable=img[5].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[5].setImageResource(R.drawable.blank);
                    blank=5;
                }
            }
        });
        img[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==3 || blank==5 || blank==9){
                    Drawable drawable=img[6].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[6].setImageResource(R.drawable.blank);
                    blank=6;
                }
            }
        });
        img[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==4 || blank==8){
                    Drawable drawable=img[7].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[7].setImageResource(R.drawable.blank);
                    blank=7;
                }
            }
        });
        img[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==5 || blank==7 || blank==9){
                    Drawable drawable=img[8].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[8].setImageResource(R.drawable.blank);
                    blank=8;
                }
            }
        });
        img[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(blank==6 || blank==8){
                    Drawable drawable=img[9].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[9].setImageResource(R.drawable.blank);
                    blank=9;
                }
            }
        });
    }

    private void rendom() {

    }

    private void init() {
        img[1] = findViewById(R.id.IMG1);
        img[2] = findViewById(R.id.IMG2);
        img[3] = findViewById(R.id.IMG3);
        img[4] = findViewById(R.id.IMG4);
        img[5] = findViewById(R.id.IMG5);
        img[6] = findViewById(R.id.IMG6);
        img[7] = findViewById(R.id.IMG7);
        img[8] = findViewById(R.id.IMG8);
        img[9] = findViewById(R.id.IMG9);
    }
}
