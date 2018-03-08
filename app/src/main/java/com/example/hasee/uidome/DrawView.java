package com.example.hasee.uidome;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by hasee on 2018/3/8.
 * 重写构造器是定制view的最基本方式
 */

public class DrawView extends View {
    public float x = 40;
    public float y = 40;

    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建画笔
        Paint p = new Paint();
        //弄画笔的颜色
        p.setColor(Color.RED);
       //绘制小圆
        canvas.drawCircle(x,y,150,p);
    }
}
