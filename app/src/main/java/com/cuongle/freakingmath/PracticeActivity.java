package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PracticeActivity extends AppCompatActivity {

    GridView praticeView;



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
    }
}