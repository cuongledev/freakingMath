package com.cuongle.freakingmath;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.content.Context.MODE_PRIVATE;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int numbers[];
    int maths[];
    SharedPreferences sharedPref;
    //int clicked = 0;
    ArrayList<Integer> list;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] numbers, int[] maths) {
        this.context = applicationContext;
        this.numbers = numbers;
        this.maths = maths;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_gridview, null); // inflate the layout
        final ImageView icon = (ImageView) view.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(numbers[i]); // set logo images
        list = new ArrayList<Integer>();//Creating arraylist
        sharedPref = context.getSharedPreferences("DataFreaking", Context.MODE_PRIVATE);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icon.setImageResource(maths[i]); // set logo images
                Log.i("NUMBER", "Số id: " + i);
                // sharedPref.edit().clear().commit();
                list.add(i);
                int clicked = sharedPref.getInt("CLICK_ASK", 0);

                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("CLICK_ASK", clicked + 1);
                editor.commit();

                int total = sharedPref.getInt("CLICK_ASK", 0);
                Toast.makeText(context.getApplicationContext(), "MESSAGE CLICKED ASK: " + total, Toast.LENGTH_LONG).show();

                for(Integer number:list)
                    //System.out.println(number);
                    Log.i("NUMBER", "Mang Array: " + Integer.toString(number));
                }


        });

        return view;
    }
}
