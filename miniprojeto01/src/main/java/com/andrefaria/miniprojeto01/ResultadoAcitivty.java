package com.andrefaria.miniprojeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoAcitivty extends AppCompatActivity {

    public static ImageView imgResultado;
    ImageButton imbtnVoltar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_acitivty);
        imbtnVoltar = findViewById(R.id.imbtnVoltar);
        imgResultado = (ImageView) findViewById(R.id.imgResultado);
        Intent it = getIntent();
        int resultado = it.getIntExtra("NumeroResultado", 0);
        if(resultado %2 == 0){
            imgResultado.setImageResource(R.drawable.moeda_cara);
        }
        else{
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imbtnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(it);
            }
        });
    }

}