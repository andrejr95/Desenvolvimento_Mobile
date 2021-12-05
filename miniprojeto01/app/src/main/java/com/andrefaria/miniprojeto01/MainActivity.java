package com.andrefaria.miniprojeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton imbtnJogar;
    ImageView imgCaraCoroa;
    int NumeroResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imbtnJogar = findViewById(R.id.imbtnJogar);
        imgCaraCoroa = findViewById(R.id.imgCaraCoroa);

        imbtnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumeroResultado = (int) (Math.random() * (10 - 1)) + 1;
                Intent it = new Intent(getApplicationContext(),ResultadoAcitivty.class);
                it.putExtra("NumeroResultado",NumeroResultado);
                startActivity(it);

            }
        });
    }


}