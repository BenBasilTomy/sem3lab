package com.example.passorfail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.content.SharedPreferences;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Button b1;
    Integer m1,m2,m3,avg;
    String n1;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.phy);
        ed3=(EditText)findViewById(R.id.chem);
        ed4=(EditText)findViewById(R.id.mat);
        b1=(Button)findViewById(R.id.b1);
        sharedpreferences = getSharedPreferences("mypref", getApplicationContext().MODE_PRIVATE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=ed1.getText().toString();
                m1=Integer.parseInt(ed2.getText().toString());
                m2=Integer.parseInt(ed3.getText().toString());
                m3=Integer.parseInt(ed4.getText().toString());

                avg=(m1+m2+m3)/3;

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("name", n1);
                editor.putInt("average", avg);

                if (avg>50)
                    editor.putString("status","PASSED");
                else
                    editor.putString("status","FAILED");

                editor.commit();

                Intent second = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(second);
            }
        });
    }
}