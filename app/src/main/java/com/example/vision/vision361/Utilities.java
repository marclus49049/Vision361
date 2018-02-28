package com.example.vision.vision361;

import android.graphics.Bitmap;

/**
 * Created by marky49049 on 2/15/18.
 */

public class Utilities {

    final static  int MAX_DIMENSION = 720;

    public static Bitmap scaleBitmapDown(Bitmap bitmap) {

        int originalWidth = bitmap.getWidth();
        int originalHeight = bitmap.getHeight();
        int resizedWidth = MAX_DIMENSION;
        int resizedHeight = MAX_DIMENSION;

        if (originalHeight > originalWidth) {
            resizedHeight = MAX_DIMENSION;
            resizedWidth = (int) (resizedHeight * (float) originalWidth / (float) originalHeight);
        } else if (originalWidth > originalHeight) {
            resizedWidth = MAX_DIMENSION;
            resizedHeight = (int) (resizedWidth * (float) originalHeight / (float) originalWidth);
        } else if (originalHeight == originalWidth) {
            resizedHeight = MAX_DIMENSION;
            resizedWidth = MAX_DIMENSION;
        }
        return Bitmap.createScaledBitmap(bitmap, resizedWidth, resizedHeight, false);
    }
}
