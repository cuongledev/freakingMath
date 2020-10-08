package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class PlayActivity extends AppCompatActivity {

    GridView simpleGrid,resultGrid;
    int numbers[] = {R.drawable.num1, R.drawable.num2, R.drawable.num3, R.drawable.num4,
            R.drawable.num5, R.drawable.num6, R.drawable.num7, R.drawable.num8, R.drawable.num9};

    int asks[] = {R.drawable.ask1, R.drawable.ask2, R.drawable.ask3, R.drawable.ask4,
            R.drawable.ask5, R.drawable.ask6, R.drawable.ask7, R.drawable.ask8, R.drawable.ask9};


    int aws[] = {R.drawable.aw1, R.drawable.aw2, R.drawable.aw3, R.drawable.aw4,
            R.drawable.aw5, R.drawable.aw6, R.drawable.aw7, R.drawable.aw8, R.drawable.aw9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        resultGrid = (GridView) findViewById(R.id.resultGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), numbers, asks);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });



        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomResultAdapter resultAdapter = new CustomResultAdapter(getApplicationContext(), aws    , asks);
        resultGrid.setAdapter(resultAdapter);
        // implement setOnItemClickListener event on GridView
        resultGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
