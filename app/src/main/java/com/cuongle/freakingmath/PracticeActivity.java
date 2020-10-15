package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PracticeActivity extends AppCompatActivity {

    GridView praticeView;



    int images[] = {R.drawable.fat_icon, R.drawable.maintenance_icon, R.drawable.muscle_icon,R.drawable.muscle_icon, R.drawable.fat_icon, R.drawable.maintenance_icon};

    String titles[] = {"Toán","Tiếng việt", "Đạo đức","Tự nhiên","Âm nhạc", "Thể dục"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);



        praticeView = (GridView) findViewById(R.id.praticeView); // init praticeView

        PraticeAdapter praticeAdapter = new PraticeAdapter(getApplicationContext(), images, titles);
        praticeView.setAdapter(praticeAdapter);
        // implement setOnItemClickListener event on GridView
        praticeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });
    }
}