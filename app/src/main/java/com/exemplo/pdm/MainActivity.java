package com.exemplo.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                Log.v("Click", "" + i);
            }
        });
*/
        Log.d("Ciclo","OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo", "OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo", "OnRestart");
    }

    public void BtnAula2(View view) {
        Intent intent = new Intent(this, Aula2.class);
        startActivity(intent);
    }
}


