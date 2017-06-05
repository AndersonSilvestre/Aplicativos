package com.example.anderson.exapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Anderson on 30/03/2017.
 */

public class imc extends AppCompatActivity {

    private EditText peso;
    private EditText altura;
    private Button btn_calcular;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc_layout);

        peso = (EditText) findViewById(R.id.peso);
        altura = (EditText) findViewById(R.id.altura);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        resultado = (TextView) findViewById(R.id.resultado);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cal_peso = Integer.parseInt(peso.getText().toString());
                float cal_altura = Float.parseFloat(altura.getText().toString());
                float cal_resultado = cal_peso / (cal_altura * cal_altura);
                String toastResultado = String.format("%.2f", cal_resultado);

                if (cal_resultado < 19){
                    resultado.setText("Abaixo do peso");
                    Toast.makeText(getBaseContext(), toastResultado, Toast.LENGTH_SHORT).show();
                }else if (cal_resultado > 32){
                    resultado.setText("Acima do peso");
                    Toast.makeText(getBaseContext(), toastResultado, Toast.LENGTH_SHORT).show();
                }else {
                    resultado.setText("Você está no peso ideal");
                    Toast.makeText(getBaseContext(), toastResultado, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
