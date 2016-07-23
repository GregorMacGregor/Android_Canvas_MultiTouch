package com.example.socrates.multi_gesten_detektor;

/*
    Ausgangspunkt: Ich will einen Gestendetektor mit Canvas realisieren
    https://examples.javacodegeeks.com/android/core/graphics/canvas-graphics/android-canvas-example/

 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mein Frame Layout casten (Typenumwandlung)
        FrameLayout frame = (FrameLayout) findViewById(R.id.FrameLayout);

        // Meine View Klasse casten
        MultiGestureView image = new MultiGestureView(this, R.drawable.navigation);

        // View hinzufügen
        frame.addView(image);
    }
}
