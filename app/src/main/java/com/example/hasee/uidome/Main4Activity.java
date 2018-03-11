package com.example.hasee.uidome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
/**
 * 这个是AutoCompleteTextView的练习Dome
 */
public class Main4Activity extends AppCompatActivity {
    //定义字符串数组
    String[] ows = new String[]{
       "源氏","莫伊拉","黑寡妇","天使"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,ows);
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.auto);
        actv.setAdapter(aa);

    }
}
