package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

        Log.i("LifeCycle", "OnCreate() Invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle","OnStart() Invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle", "OnPause() Invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle", "OnStop() Invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle", "OnDestroy Invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle", "OnRestart Invoked");
    }
}