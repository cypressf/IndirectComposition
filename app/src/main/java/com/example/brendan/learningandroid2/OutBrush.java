package com.example.brendan.learningandroid2;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * Created by brendan on 9/21/2015.
 */
public class OutBrush extends Brush {

    @Override
    public void onTouch(VectorField theField, Canvas vectorCanvas, Canvas paintCanvas, Paint drawPaint, float x, float y, float strength, Paint color) {
        ArrayList<VectorNode> within = theField.findAllWithin(x,y,200);
//        Log.d("", Integer.toString(within.size()));
        for(VectorNode vector : within){
            vector.unDraw(vectorCanvas);
            vector.unDraw(vectorCanvas);
            vector.setAway(x,y);
            vector.draw(vectorCanvas);

        }

//        theField.draw(vectorCanvas, drawPaint);
    }

    @Override
    public void update(VectorField theField, Canvas drawCanvas) {
    }
}