package com.example.android.inter_iit;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        ArrayList<CardClass> list=new ArrayList<>() ;
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Masdja",R.drawable.indore,"IIT MAdr" ));
        list.add(new CardClass(R.drawable.madras,"IIT Mad",R.drawable.indore,"IIT M" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));
        list.add(new CardClass(R.drawable.madras,"IIT Madras",R.drawable.indore,"IIT Indore" ));

        ListAdapter adapter=new ListAdapter(this,0,list);
        ListView lv=findViewById(R.id.Lst1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView score=findViewById(R.id.score);
                expand(view,500,0);
                score.setText("00");
            }
        });

    }






    public static void expand(final View v, int duration, int targetHeight) {

        int prevHeight  = v.getHeight();

        v.setVisibility(View.VISIBLE);
        ValueAnimator valueAnimator = ValueAnimator.ofInt(prevHeight, 2*prevHeight);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                v.getLayoutParams().height = (int) animation.getAnimatedValue();
                v.requestLayout();
            }
        });
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(duration);
        valueAnimator.start();
    }







    public static void collapse(final View v, int duration, int targetHeight) {
        int prevHeight  = v.getHeight();
        ValueAnimator valueAnimator = ValueAnimator.ofInt(prevHeight, targetHeight);
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                v.getLayoutParams().height = (int) animation.getAnimatedValue();
                v.requestLayout();
            }
        });
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(duration);
        valueAnimator.start();
    }
}


