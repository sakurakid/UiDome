package com.example.hasee.uidome;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;

public class Main7Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        final ImageView imageView = (ImageView)findViewById(R.id.tp);
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekbar_Doem);
        RatingBar ratingBar = (RatingBar)findViewById(R.id.Rar_a);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            //位置改变的时候
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                imageView.setAlpha(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            //改变时候的
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                imageView.setAlpha((int)(rating*255/6));
            }
        });


    }


}