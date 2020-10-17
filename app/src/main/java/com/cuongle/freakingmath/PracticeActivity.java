package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import static maes.tech.intentanim.CustomIntent.customType;

import static maes.tech.intentanim.CustomIntent.customType;

public class PracticeActivity extends AppCompatActivity implements View.OnClickListener {

    CardView cv_one,cv_two,cv_three,cv_four,cv_five,cv_six;
    GridView praticeView;
    private int state = 0;
    Animation fade;


    CardView tv_one,tv_two,tv_three;



    int images[] = {R.drawable.ic_book_blue, R.drawable.ic_book_deep, R.drawable.ic_book_green,R.drawable.ic_book_pure, R.drawable.ic_book_yellow, R.drawable.ic_book_pink};

    String titles[] = {"Toán","Tiếng việt", "Đạo đức","Tự nhiên","Âm nhạc", "Thể dục"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);



        /*praticeView = (GridView) findViewById(R.id.praticeView); // init praticeView

        PraticeAdapter praticeAdapter = new PraticeAdapter(getApplicationContext(), images, titles);
        praticeView.setAdapter(praticeAdapter);
        // implement setOnItemClickListener event on GridView
        praticeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });*/

        cv_one = findViewById(R.id.cv_one);
        cv_two = findViewById(R.id.cv_two);
        cv_three = findViewById(R.id.cv_three);
        cv_four = findViewById(R.id.cv_four);
        cv_five = findViewById(R.id.cv_five);
        cv_six = findViewById(R.id.cv_six);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cv_one:
                rightToLeft();
                break;
            case R.id.cv_two:
                rightToLeft();
                break;
            case R.id.cv_three:
                rightToLeft();
                break;
            case R.id.cv_four:
                rightToLeft();
                break;
            case R.id.cv_five:
                rightToLeft();
                break;
            case R.id.cv_six:
                rightToLeft();
                break;
            default:
                break;
        }
    }

    public void rightToLeft(){
        startActivity(new Intent(PracticeActivity.this, PlayActivity.class));
        customType(PracticeActivity.this,"right-to-left");
    }
}