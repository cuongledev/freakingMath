package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import static maes.tech.intentanim.CustomIntent.customType;

public class WelcomeActivity extends AppCompatActivity {

    LinearLayout practice_item,competition_item,lesson_item;
    Button btn_continue, btn_cancel;
    private int state = 0;

    Animation fade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        practice_item = findViewById(R.id.practice_item);
        competition_item = findViewById(R.id.competition_item);
        lesson_item = findViewById(R.id.lesson_item);
        btn_continue = findViewById(R.id.btn_continue);
        btn_cancel = findViewById(R.id.btn_cancel);

        fade = AnimationUtils.loadAnimation(this,R.anim.fade);
        btn_continue.setAlpha(0);
        btn_cancel.setAlpha(0);
        practice_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = 1;
                practice_item.setBackground(getDrawable(R.drawable.bg_item_selected));
                competition_item.setBackground(getDrawable(R.drawable.bg_item));
                lesson_item.setBackground(getDrawable(R.drawable.bg_item));
                btn_continue.setAlpha(1);
                btn_cancel.setAlpha(1);
                btn_continue.startAnimation(fade);
            }
        });
        competition_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = 2;
                competition_item.setBackground(getDrawable(R.drawable.bg_item_selected));
                practice_item.setBackground(getDrawable(R.drawable.bg_item));
                lesson_item.setBackground(getDrawable(R.drawable.bg_item));
                btn_continue.setAlpha(1);
                btn_cancel.setAlpha(1);
                btn_continue.startAnimation(fade);
            }
        });
        lesson_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = 3;
                lesson_item.setBackground(getDrawable(R.drawable.bg_item_selected));
                practice_item.setBackground(getDrawable(R.drawable.bg_item));
                competition_item.setBackground(getDrawable(R.drawable.bg_item));
                btn_continue.setAlpha(1);
                btn_cancel.setAlpha(1);
                btn_continue.startAnimation(fade);
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                state = 0;
                practice_item.setBackground(getDrawable(R.drawable.bg_item));
                competition_item.setBackground(getDrawable(R.drawable.bg_item));
                lesson_item.setBackground(getDrawable(R.drawable.bg_item));
                btn_continue.setAlpha(0);
                btn_cancel.setAlpha(0);
            }
        });


        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("STATE" , "STATE: " + state);
                switch (state){
                    case 1:
                        slideUp();
                        break;
                    case 2:
                        rightToLeft();
                        break;
                    case 3:
                        upToBottom();
                        break;
                    default:
                        break;
                }

            }
        });



    }

    public void slideUp(){
        startActivity(new Intent(WelcomeActivity.this, PlayActivity.class));
        customType(WelcomeActivity.this,"bottom-to-up");
    }
    public void upToBottom(){
        startActivity(new Intent(WelcomeActivity.this, PlayActivity.class));
        customType(WelcomeActivity.this,"up-to-bottom");
    }
    public void rightToLeft(){
        startActivity(new Intent(WelcomeActivity.this, PlayActivity.class));
        customType(WelcomeActivity.this,"right-to-left");
    }
}
