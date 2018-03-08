package com.example.hasee.uidome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
//    int[] image = new int[]{
//            R.drawable.a,
//            R.drawable.b,
//            R.drawable.c,
//            R.drawable.d,
//    };
//    int currentImage = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        //学习用代码控制UI
//        LinearLayout layout =  new LinearLayout(this);//创建一个线性布局对象
//
//        super.setContentView(layout);  //用这个活动来显示这layout
//
//        final TextView show = new TextView(this);
//
//        Button bn = new Button(this);
//
//        bn.setText("点击我");
//        layout.addView(bn);
//        layout.addView(show); //向里面加入东西
//
//        bn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                show.setText("hallo android w will learn you "+new java.util.Date());
//            }
//        });

       LinearLayout main = (LinearLayout)findViewById(R.id.toot);  //获取布局容器
//        final ImageView imageView = new ImageView(this);
//        main.addView(imageView);
//
//        //初始化的时候显示第一张照片
//        imageView.setImageResource(image[0]);
//
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(currentImage >  3){
//                    currentImage = 0;
//                }
//                imageView.setImageResource(image[currentImage++]);
//            }
//        });

      final DrawView drawView = new DrawView(this);  //建立自定义的组件的对象
      drawView.setMinimumHeight(3000);
      drawView.setMinimumWidth(5000);  //设置自定义组件的最大的宽度和高度
      drawView.setOnTouchListener(new View.OnTouchListener() {   //绑定Touch事件
          @Override
          public boolean onTouch(View view, MotionEvent motionEvent) {
              drawView.x = motionEvent.getX();
              drawView.y = motionEvent.getY();

              drawView.invalidate();
              return true;
          }
      });
      main.addView(drawView);





    }
}
