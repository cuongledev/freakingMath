package com.cuongle.freakingmath;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PraticeAdapter extends BaseAdapter {

    Context context;
    int images[];
    String titles[];
    ArrayList<Integer> list;
    LayoutInflater inflter;

    public PraticeAdapter(Context applicationContext, int[] images, String[] titles) {
        this.context = applicationContext;
        this.images = images;
        this.titles = titles;
        inflter = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return images.length;
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
        view = inflter.inflate(R.layout.pratice_view, null); // inflate the layout
        final ImageView icon_book = (ImageView) view.findViewById(R.id.icon_book); // get the reference of ImageView
        final TextView title_book =  (TextView) view.findViewById(R.id.title_book); // get the reference of ImageView
        icon_book.setImageResource(images[i]); // set logo images
        title_book.setText(titles[i]); // set logo images


        return view;
    }
}
