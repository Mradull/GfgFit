package com.example.gfgfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gfgfit.MainActivity;
import com.example.gfgfit.R;

public class Splashscreen extends AppCompatActivity {
    TextView textView1, textView2;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        textView1 = findViewById(R.id.textview1);
        textView2 = findViewById(R.id.textview2);
        imageView1 = findViewById(R.id.image1);
        fade();
    }

    private void fade() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade);
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.fade);
        anim.reset();
        textView1.clearAnimation();
        textView1.startAnimation(anim);
        textView2.clearAnimation();
        textView2.startAnimation(anim);
        imageView1.clearAnimation();
        imageView1.startAnimation(anim1);

        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                Splashscreen.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        anim1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(Splashscreen.this, login.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}