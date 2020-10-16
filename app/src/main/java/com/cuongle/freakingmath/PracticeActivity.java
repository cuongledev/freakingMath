package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import static maes.tech.intentanim.CustomIntent.customType;

public class PracticeActivity extends AppCompatActivity {

    GridView praticeView;


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


        tv_one = findViewById(R.id.tv_one);
        tv_two = findViewById(R.id.tv_two);
        tv_three = findViewById(R.id.tv_three);

        tv_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightToLeft();
            }
        });
        tv_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightToLeft();
            }
        });
        tv_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightToLeft();
            }
        });


    }

    public void rightToLeft(){
        startActivity(new Intent(PracticeActivity.this, PlayActivity.class));
        customType(PracticeActivity.this,"right-to-left");
    }
}