package com.example.hasee.uidome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个是spinner的Dome
 */

public class Main5Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private TextView tv = null;
    private Spinner sp = null;

    private  String[] city = {"北京","上海","广东","南京","杭州"};
    private List<String> list = null;
    private ArrayAdapter arrayAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setData();

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(this);
    }
    private void initViews(){
        list = new ArrayList<>();
        tv = (TextView) findViewById(R.id.show);
        sp = (Spinner) findViewById(R.id.spinner);

    }
    private void setData(){
        for(int i = 0;i<city.length;i++){
            list.add(city[i]);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String name = (String) arrayAdapter.getItem(i);
        tv.setText(name);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
