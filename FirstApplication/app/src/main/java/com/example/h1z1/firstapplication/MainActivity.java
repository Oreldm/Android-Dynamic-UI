package com.example.h1z1.firstapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout layout=new RelativeLayout(this);
        layout.setBackgroundColor(Color.GREEN);

        Resources r  = getResources(); //to get data about the application

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );


        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Button redButton = new Button(this);
        redButton.setText("Click Me!");
        redButton.setBackgroundColor(Color.RED);
        redButton.setId(1);

        //Username input
        EditText username = new EditText(this);
        username.setId(2);

        int usernamePixelsWidth = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200 ,
                r.getDisplayMetrics()); //dip value to pixels value

        username.setWidth(usernamePixelsWidth);

        //give rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        layout.addView(redButton, buttonDetails);
        layout.addView(username,usernameDetails);
        setContentView(layout);

    }

}
