package com.cuongle.freakingmath;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomResultAdapter extends BaseAdapter {

    Context context;
    int numbers[];
    int maths[];
    LayoutInflater inflter;

    public CustomResultAdapter(Context applicationContext, int[] numbers, int[] maths) {
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
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icon.setImageResource(maths[i]); // set logo images
                Log.i("NUMBER", "Số id: " + i);
            }
        });

        return view;
    }
}
