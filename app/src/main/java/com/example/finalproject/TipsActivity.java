package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class TipsActivity extends AppCompatActivity implements View.OnClickListener{

    String[] tips = {"TENT INFO: \n " +
                        "1. Practice setting up tent at home \n" +
                        "2. Pick your campsites ahead of time \n" +
                        "3. Prepare some food beforehand \n" +
                        "4. Bring extra pads to make the tent comfortable \n" +
                        "5. Waterproof the tent if it's not by default",

                    "FOOD INFO: \n" +
                        "1. Don't take too much ready-made dishes\n" +
                        "2. Do take some simple-to-eat food, e.g. granola bars, sandwiches, etc\n" +
                        "3. Be careful about the mushrooms, there's another page for that in this app\n",

                    "BONFIRE INFO: \n" +
                        "1. Use pits \n" +
                        "2. Keep water nearby\n" +
                        "3. Use local firewood\n" +
                        "4. Pay attention to the wind\n" +
                        "5. Be careful with pets and children",

                    "COMMON INFO: \n" +
                        "1. Do behave carefully and don't leave any rubbish\n" +
                        "2. Do hiking with a companion, not solo\n" +
                        "3. Choose a trail you can handle\n" +
                        "4. Bring enough water, mind extraordinary cases"};

    public TextView tipView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        tipView = findViewById(R.id.tip_view);
        tipView.setMovementMethod(new ScrollingMovementMethod());

        Button tentButton = findViewById(R.id.tent_btn);
        Button foodButton = findViewById(R.id.food_btn);
        Button bonfireButton = findViewById(R.id.bonfire_btn);
        Button commonInfoButton = findViewById(R.id.common_info_btn);

        tentButton.setOnClickListener(this);
        foodButton.setOnClickListener(this);
        bonfireButton.setOnClickListener(this);
        commonInfoButton.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.food_btn:
                tipView.setText(tips[1]);
                //Toast.makeText(getApplicationContext(), "food", Toast.LENGTH_LONG).show();
                break;
            case R.id.tent_btn:
                tipView.setText(tips[0]);
                //Toast.makeText(getApplicationContext(), "tent", Toast.LENGTH_LONG).show();
                break;
            case R.id.bonfire_btn:
                tipView.setText(tips[2]);
                //Toast.makeText(getApplicationContext(), "bonfire", Toast.LENGTH_LONG).show();
                break;
            case R.id.common_info_btn:
                tipView.setText(tips[3]);
                //Toast.makeText(getApplicationContext(), "common info", Toast.LENGTH_LONG).show();
        }
    }
}