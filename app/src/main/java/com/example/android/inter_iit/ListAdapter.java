package com.example.android.inter_iit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter {
    public ListAdapter(Context context, int resource, List<CardClass> list){
        super(context, 0,list);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CardClass currentData=(CardClass) getItem(position);
        View ListItemView=convertView;
        if(ListItemView==null)
            ListItemView= LayoutInflater.from(getContext()).inflate(R.layout.listlayout,parent,false);

        TextView team1=ListItemView.findViewById(R.id.T1);
        team1.setText(currentData.getTeam1());
        TextView team2=ListItemView.findViewById(R.id.T2);
        team2.setText(currentData.getTeam2());
        ImageView logo1 = ListItemView.findViewById(R.id.logo1);
        logo1.setImageResource(currentData.getLogo1());
        ImageView logo2 = ListItemView.findViewById(R.id.logo2);
        logo2.setImageResource(currentData.getLogo2());



        return ListItemView;
    }
}
