package com.example.android.inter_iit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.inter_iit.NewActivity.collapse;
import static com.example.android.inter_iit.NewActivity.expand;

public class Badminton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);
        ArrayList<CardClass> list=new ArrayList<>() ;
        list.add(new CardClass(R.drawable.madras,"IIT Maas",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT dja",R.drawable.indore,"IIT MAdr" ));
        list.add(new CardClass(R.drawable.madras,"IIT Mad",R.drawable.indore,"IIT M" ));
        list.add(new CardClass(R.drawable.madras,"IIT dras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT adras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT adras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT adras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT ras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT dras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT dras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT ras",R.drawable.indore,"IIT Indore" ));

        final int [] cursor=new int[20];
        ListAdapter adapter=new ListAdapter(this,0,list);
        ListView lv=findViewById(R.id.Lst1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView score=view.findViewById(R.id.score);
                if(cursor[i]==0 ){
                    expand(view,500,0);
                    score.setVisibility(View.VISIBLE);
                    score.setText("0-0");
                    cursor[i]=1;
                }
                else{
                    collapse(view,500,0);
                    cursor[i]=0;
                }
            }
        });
    }
}
