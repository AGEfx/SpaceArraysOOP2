package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket {
    float x, y, vx, vy;
    static  Bitmap pic = ImageManager.get(R.drawable.rocket);

    Rocket(){
        this.x = (float)(Math.random()*500);
        this.y = (float)(Math.random()*500);
        this.vx = (float)(Math.random()*11)-5;
        this.vy = (float)(Math.random()*11)-5;
    }

    void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    Paint paint = new Paint();
    Matrix matrix = new Matrix();
    void draw(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }
}
