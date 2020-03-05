package com.exemplo.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class OutraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outra);

        float valor = Float.parseFloat(getIntent().getStringExtra("celcius"));
        valor = ((valor*9)/5)+32;
        TextView t1 =findViewById(R.id.textView2);
        t1.setText(String.valueOf(valor));
    }
}
