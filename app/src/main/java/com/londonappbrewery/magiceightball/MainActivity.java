package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set variable to find 8ball image view by id
        final ImageView ballDisplay = findViewById(R.id.image_8ball);

        // Image Array
        final int [] ballArr = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // Create button connection between xml button
        Button eightBallBtn = findViewById(R.id.askButton);

        // Create listener for button
        eightBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            /**
             * When clicked button generates a random answer
             * public void onClick(View view)
             * @param view
             */
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int num = randomNumberGenerator.nextInt(5);
                int imageResourceId = ballArr[num];
                ballDisplay.setImageResource(imageResourceId);
            }
        });

    }
}
