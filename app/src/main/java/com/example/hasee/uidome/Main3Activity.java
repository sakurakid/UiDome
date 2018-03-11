package com.example.hasee.uidome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * 这个是CheckBox的Doem
 * checkbox.isChecked();是判断后是否选中，
 *checkbox.setChecked(true|false)是赋某个checkbox选中。
 */
public class Main3Activity extends AppCompatActivity {
    //先定义三个变量
    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox playBox;
    private CheckBox allBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //然后绑定
        eatBox = (CheckBox)findViewById(R.id.eat_Id);
        sleepBox = (CheckBox)findViewById(R.id.sleep_Id);
        playBox = (CheckBox)findViewById(R.id.play_Id);

        AllCheckListener allCheckListener = new AllCheckListener();
        allBox.setOnClickListener(allCheckListener);

        BoxCheckListener boxCheckListener = new BoxCheckListener();
        eatBox.setOnCheckedChangeListener(boxCheckListener);
        sleepBox.setOnCheckedChangeListener(boxCheckListener);
        playBox.setOnCheckedChangeListener(boxCheckListener);



    }

    /**
     * 这个是全选的
     */
    class AllCheckListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            CheckBox all = (CheckBox) view;

            eatBox.setChecked(all.isChecked());
            sleepBox.setChecked(all.isChecked());
            playBox.setChecked(all.isChecked());


        }
    }

    class BoxCheckListener implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(!b){
                allBox.setChecked(b);

            }
        }
    }


}
