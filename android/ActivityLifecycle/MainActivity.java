 package com.example.activitybenorginal;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.activitybenorginal.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate Called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Called",Toast.LENGTH_SHORT).show();
    }

     @Override
     protected void onPause() {
         super.onPause();
         Toast.makeText(this,"onPause Called",Toast.LENGTH_SHORT).show();

     }

     @Override
     protected void onResume() {
         super.onResume();
         Toast.makeText(this,"onResume Called",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onRestart() {
         super.onRestart();
         Toast.makeText(this,"onRestart Called",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onStop() {
         super.onStop();
         Toast.makeText(this,"onStop Called",Toast.LENGTH_SHORT).show();
     }

     @Override
     protected void onDestroy() {
         super.onDestroy();
         Toast.makeText(this,"onDestroy Called",Toast.LENGTH_SHORT).show();
     }
 }
