package com.test.animation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void defaultAnimation(View v) {
        Intent nextActivity = new Intent(this, NextActivity.class);
        startActivity(nextActivity);
    }

    public void scaleAnimation(View v) {
        Intent subActivity = new Intent(this, NextActivity.class);
        Bundle scaleBundle = ActivityOptions.makeScaleUpAnimation(
                v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
        startActivity(subActivity, scaleBundle);
    }

    public void clipAnimation(View v) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Intent subActivity = new Intent(this, NextActivity.class);
            Bundle scaleBundle = ActivityOptions.makeClipRevealAnimation(
                    v, 0, 0, v.getWidth(), v.getHeight()).toBundle();
            startActivity(subActivity, scaleBundle);
        }
    }

    public void translateAnimationLeftRight(View v) {
        Intent subActivity = new Intent(this, ItemListActivity.class);
        Bundle translateBundle = ActivityOptions.makeCustomAnimation(this,
                R.anim.slide_in_left, R.anim.slide_out_left).toBundle();
        startActivity(subActivity, translateBundle);
    }

    public void translateAnimationRightLeft(View v) {
        Intent subActivity = new Intent(this, ItemListActivity.class);
        Bundle translateBundle = ActivityOptions.makeCustomAnimation(this,
                R.anim.slide_in_right, R.anim.slide_out_right).toBundle();
        startActivity(subActivity, translateBundle);
    }

    public void translateAnimationTopBottom(View v) {
        Intent subActivity = new Intent(this, ItemListActivity.class);
        Bundle translateBundle = ActivityOptions.makeCustomAnimation(this,
                R.anim.slide_in_top, R.anim.slide_out_top).toBundle();
        startActivity(subActivity, translateBundle);
    }

    public void translateAnimationBottomTop(View v) {
        Intent subActivity = new Intent(this, ItemListActivity.class);
        Bundle translateBundle = ActivityOptions.makeCustomAnimation(this,
                R.anim.slide_in_bottom, R.anim.slide_out_bottom).toBundle();
        startActivity(subActivity, translateBundle);
    }

    public void translateAnimationFade(View v) {
        Intent subActivity = new Intent(this, ItemListActivity.class);
        Bundle translateBundle = ActivityOptions.makeCustomAnimation(this,
                R.anim.fade_in, R.anim.fade_out).toBundle();
        startActivity(subActivity, translateBundle);
    }

    public void sharedTransition(View v) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Intent subActivity = new Intent(this, ItemListActivity.class);
            startActivity(subActivity);
        }
    }

    public void zoom(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.zoom(this);
    }

    public void card(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.card(this);
    }

    public void split(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.split(this);
    }

    public void shrink(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.shrink(this);
    }

    public void inAndOut(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.inAndOut(this);
    }

    public void swipeLeft(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.swipeLeft(this);
    }

    public void swipeRight(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.swipeRight(this);
    }

    public void slideLeft(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.slideLeft(this);
    }

    public void slideRight(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.slideRight(this);
    }

    public void slideDown(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.slideDown(this);
    }

    public void slideUp(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.slideUp(this);
    }

    public void fade(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.fade(this);
    }

    public void windmill(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.windmill(this);
    }

    public void diagonal(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.diagonal(this);
    }

    public void spin(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        PendingTransitionUtils.spin(this);
    }
}
