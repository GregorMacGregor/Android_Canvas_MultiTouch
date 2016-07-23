package com.example.socrates.multi_gesten_detektor;

import android.content.Context;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;

/**
 * Created by Socrates on 23.07.2016.
 */
public class MultiGestureView extends View {

    // Matrix deklarieren
    private Matrix matrix;
    // Bitmap deklarieren
    private Bitmap myImage;

    public MultiGestureView(Context context, int iGraphicRessourceId) { // Context + eine ID für die Bitmap
        super(context);
        matrix = new Matrix(); // Matrix initialisieren

        // Das zu manipulierendes Bitmap
        myImage = BitmapFactory.decodeResource( getResources(), iGraphicRessourceId );
    }

    // On Draw Klasse überschreiben
        //Called when the view should render its content.
        //https://developer.android.com/reference/android/view/View.html
    @Override
    protected void onDraw(Canvas canvas) {
        Matrix transformedMatrix = new Matrix(matrix);

        canvas.drawBitmap( myImage,transformedMatrix, null );
    }
}
