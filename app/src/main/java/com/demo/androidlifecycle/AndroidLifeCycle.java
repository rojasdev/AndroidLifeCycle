package com.demo.androidlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class AndroidLifeCycle extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        Toast.makeText(this, "onCreate invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy invoked", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle","onDestroy invoked");
    }
}
