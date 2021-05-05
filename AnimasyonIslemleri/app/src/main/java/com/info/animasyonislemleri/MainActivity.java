package com.info.animasyonislemleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonYap, button;

    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        buttonYap = findViewById(R.id.buttonYap);

        //animation = AnimationUtils.loadAnimation(this, R.anim.alphacalisma);
        //animation = AnimationUtils.loadAnimation(this, R.anim.scalecalismasi);
        //animation = AnimationUtils.loadAnimation(this, R.anim.rotatecalismasi);
        //animation = AnimationUtils.loadAnimation(this, R.anim.translatecalismasi);
        //animation = AnimationUtils.loadAnimation(this, R.anim.blinkcalismasi);
        //animation = AnimationUtils.loadAnimation(this, R.anim.ayniandacalismasi);
        animation = AnimationUtils.loadAnimation(this, R.anim.ardisikcalismasi);

        buttonYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.startAnimation(animation);
            }
        });

    }
}