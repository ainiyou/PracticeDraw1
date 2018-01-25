package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        //连接到圆心扇形
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200,200,450,325,-120,100,true,mPaint);
        //不连接到圆心扇形
        canvas.drawArc(200,200,450,325,20,140,false,mPaint);
        //弧形
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200,200,450,325,180,55,false,mPaint);
    }
}
