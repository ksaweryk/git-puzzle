package com.samsung.galaxygeeks.gitpuzzle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setImageResource(R.drawable.balcony);

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.more_balcony);

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setImageResource(R.drawable.blue_building);

        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setImageResource(R.drawable.estaciores);

        ImageView imageView5 = findViewById(R.id.imageView5);
        imageView5.setImageResource(R.drawable.roof);

        ImageView imageView6 = findViewById(R.id.imageView6);
        imageView6.setImageResource(R.drawable.blue_gate);

        ImageView imageView7 = findViewById(R.id.imageView7);
        imageView7.setImageResource(R.drawable.left_fender);

        ImageView imageView8 = findViewById(R.id.imageView8);
        imageView8.setImageResource(R.drawable.trunk);

        ImageView imageView9 = findViewById(R.id.imageView9);
        imageView9.setImageResource(R.drawable.rear_light);

    }
}
