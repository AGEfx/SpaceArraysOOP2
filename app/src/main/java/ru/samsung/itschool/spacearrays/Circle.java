package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;


public class Circle implements Drawable {
    float x,y,r = 20;
    Paint paint = new Paint();
    public void draw(Canvas canvas){
        canvas.drawCircle(x,y,r,paint);
    }

    public Circle(float x, float y) {
        this.x = x;
        this.y = y;
    }

   }
