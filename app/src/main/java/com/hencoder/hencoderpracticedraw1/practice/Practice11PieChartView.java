package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        //画红色扇形 圆心(300,300)
        mPaint.setColor(Color.RED);
        canvas.drawArc(200,200,400,400,180,130,true,mPaint);
        //画其他扇形
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(210,220,410,410,310,50,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(210,220,410,410,0,5,true,mPaint);
        mPaint.setColor(Color.parseColor("#8A2BE2"));
        canvas.drawArc(210,220,410,410,5,15,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(210,220,410,410,22,8,true,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(210,220,410,410,32,40,true,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(210,220,410,410,78,102,true,mPaint);

        //标注扇形
        mPaint.setColor(Color.LTGRAY);
        mPaint.setTextSize(16);
        mPaint.setStrokeWidth(2);
        canvas.drawText("Lollipop",25,190,mPaint);
        canvas.drawLine(90,200,210,200,mPaint);
        canvas.drawLine(210,200,240,220,mPaint);

        canvas.drawText("KitKat",45,360,mPaint);
        canvas.drawLine(100,360,210,360,mPaint);
        canvas.drawLine(210,360,230,360,mPaint);

        canvas.drawText("Marshmallow",450,250,mPaint);
        canvas.drawLine(440,250,400,250,mPaint);
        canvas.drawLine(400,250,380,260,mPaint);

        canvas.drawText("Froyo",450,315,mPaint);
        canvas.drawLine(445,320,410,320,mPaint);

        canvas.drawText("Gingerbread",450,345,mPaint);
        canvas.drawLine(445,345,410,345,mPaint);

        canvas.drawText("Ice Cream Sandwich",450,370,mPaint);
        canvas.drawLine(445,370,410,370,mPaint);
        canvas.drawLine(410,370,390,355,mPaint);

        canvas.drawText("Jelly Bean",450,400,mPaint);
        canvas.drawLine(445,405,425,405,mPaint);
        canvas.drawLine(425,405,380,380,mPaint);


        mPaint.setTextSize(22);
        canvas.drawText("饼图",300,450,mPaint);
    }
}
