package com.tatvasoftassignment.lifecycleobserverdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("main","owner onCreate");
        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("main","owner onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("main","owner onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("main","owner onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("main","owner onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("main","owner onStop");
    }
}