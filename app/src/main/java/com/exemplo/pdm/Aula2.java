package com.exemplo.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Aula2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula2);
    }

    public void btnConverter(View view) {
        EditText editText = findViewById(R.id.editText);
        String ValorDigitado = editText.getText().toString();

        if (ValorDigitado.isEmpty()){
            return;
        }
        Intent intent = new Intent(this, OutraActivity.class);
        intent.putExtra("celcius", ValorDigitado);
        startActivity(intent);
    }
}
