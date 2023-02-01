package com.shantanu.quizapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListViewAdapter extends BaseAdapter {

    private final String[] domain_names;
    private final int[] domain_logo;
    private Context context;
    private final LayoutInflater inflater;

    public ListViewAdapter(String[] domain_names, int[] domain_logo, Context context) {
        this.domain_names = domain_names;
        this.domain_logo = domain_logo;
        this.context = context;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return domain_logo.length;
    }

    @Override
    public Object getItem(int position) {
        return domain_names[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View v = inflater.inflate(R.layout.list_view_single_item, null);
        CircleImageView logo = v.findViewById(R.id.domain_image);
        TextView name = v.findViewById(R.id.domain_title);

        logo.setImageResource(domain_logo[position]);
        name.setText(domain_names[position]);

        return v;
    }
}
