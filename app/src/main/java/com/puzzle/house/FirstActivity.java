package com.puzzle.house;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {
    private GridView gridView;
    private AdView mAdView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        gridView = findViewById(R.id.gridview);

        showInterstitial();
        showAd();
    }

    private void showInterstitial() {
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_unit_id));
        interstitialAd.setAdListener(
                new AdListener() {
                    @Override
                    public void onAdLoaded() {
                        interstitialAd.show();
                       // setView();

                    }

                    @Override
                    public void onAdFailedToLoad(LoadAdError loadAdError) {
                        setView();


                    }

                    @Override
                    public void onAdClosed() {
                        setView();

                    }
                });
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);
       /* if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
        else {
            if (!interstitialAd.isLoading() && !interstitialAd.isLoaded()) {
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitialAd.loadAd(adRequest);
            }
        }*/
    }

    private void setView() {
        ArrayList<PersonGroup> personGroups = new ArrayList<>();
        personGroups.add(new PersonGroup("Picture Puzzle", "http://api.sardershipon.com/sendonbd/icon/quick_sms.png"));
        personGroups.add(new PersonGroup("2048 Puzzle", "http://api.sardershipon.com/sendonbd/icon/dynamic_sms.png"));
        HomePageAdapter packageAdapter = new HomePageAdapter(this, personGroups);
        gridView.setAdapter(packageAdapter);
    }
    private void showAd() {
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(String.valueOf(R.string.unit_id));
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }


}