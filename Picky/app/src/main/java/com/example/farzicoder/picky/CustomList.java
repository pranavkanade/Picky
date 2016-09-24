package com.example.farzicoder.picky;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by farzicoder on 9/24/16.
 */

public class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;

    public CustomList(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.sub_list, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.sub_list, parent, false);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.itemTxt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.itemImage);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}