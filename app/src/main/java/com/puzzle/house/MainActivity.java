package com.puzzle.house;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    ImageView img[] = new ImageView[10];
    FrameLayout frameLayout;
    int mode = 0;
    int blank = 3;
    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resize();
        getWidth();
        init();
        showAd();
        mode = 1;
        rendom();
        clicklistener();
    }

    private void showAd() {
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(String.valueOf(R.string.unit_id));
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        setAdListener();
    }

    private void setAdListener() {
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });
    }

    private int getWidth() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;
        return width;
    }

    private void resize() {

        blank = 3;
    }

    private void clicklistener() {
        img[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 2 || blank == 4) {
                    Drawable drawable = img[1].getDrawable();
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
                    Drawable drawable = img[2].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[2].setImageResource(R.drawable.blank);
                    blank = 2;
                }
            }
        });
        img[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 2 || blank == 6) {
                    Drawable drawable = img[3].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[3].setImageResource(R.drawable.blank);
                    blank = 3;
                }
            }
        });
        img[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 1 || blank == 5 || blank == 7) {
                    Drawable drawable = img[4].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[4].setImageResource(R.drawable.blank);
                    blank = 4;
                }
            }
        });
        img[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 2 || blank == 4 || blank == 6 || blank == 8) {
                    Drawable drawable = img[5].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[5].setImageResource(R.drawable.blank);
                    blank = 5;
                }
            }
        });
        img[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 3 || blank == 5 || blank == 9) {
                    Drawable drawable = img[6].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[6].setImageResource(R.drawable.blank);
                    blank = 6;
                }
            }
        });
        img[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 4 || blank == 8) {
                    Drawable drawable = img[7].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[7].setImageResource(R.drawable.blank);
                    blank = 7;
                }
            }
        });
        img[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 5 || blank == 7 || blank == 9) {
                    Drawable drawable = img[8].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[8].setImageResource(R.drawable.blank);
                    blank = 8;
                }
            }
        });
        img[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (blank == 6 || blank == 8) {
                    Drawable drawable = img[9].getDrawable();
                    img[blank].setImageDrawable(drawable);
                    img[9].setImageResource(R.drawable.blank);
                    blank = 9;
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
        frameLayout = findViewById(R.id.frameLayout);
        frameLayout.getLayoutParams().height = getWidth();
    }
}
