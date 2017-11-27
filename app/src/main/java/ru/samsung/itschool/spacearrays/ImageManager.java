package ru.samsung.itschool.spacearrays;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageManager {
    static final int MAX = 100;
    static int id[] = new int [MAX];
    static Bitmap [] pic = new Bitmap[MAX];
    static int n = 0;
    static Resources resources;
    static Bitmap get(int picId){
        for (int i = 0; i < n; i++){
            if (id[i] == picId)
  return pic[i];
    }
    id[n] = picId;
        pic[n]= BitmapFactory.decodeResource(resources, picId);
        return pic[n++];
    }
}
