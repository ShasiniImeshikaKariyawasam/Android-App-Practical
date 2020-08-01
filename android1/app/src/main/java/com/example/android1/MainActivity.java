package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("17020344","Entering onCreate(.)");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("17020344","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("17020344","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("17020344","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("17020344","onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("17020344","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("17020344","onDestroy invoked");
    }
}
