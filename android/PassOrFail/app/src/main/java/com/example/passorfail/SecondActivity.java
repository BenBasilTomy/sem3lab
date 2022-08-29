package com.example.passorfail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView)findViewById(R.id.text_view);
        TextView avgView = (TextView)findViewById(R.id.text_view2);
        TextView statusView = (TextView)findViewById(R.id.text_view3);


        sharedpreferences = getSharedPreferences("mypref", MODE_PRIVATE);

        String name = sharedpreferences.getString("name","");
        Integer average = sharedpreferences.getInt("average",0);
        String status = sharedpreferences.getString("status","");

        textView.setText(name);
        avgView.setText(String.valueOf(average));
        statusView.setText(status);

    }
}