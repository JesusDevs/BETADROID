package com.example.alfa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*int resultado1= add("");
        Log.d("resultado1",String.valueOf(resultado1));
        int resultado2= add("3");
        Log.d("resultado2",String.valueOf(resultado2));
        int resultado3= add("3,4");
        Log.d("resultado3",String.valueOf(resultado3))*/

        //Actividad número 2

        final TextView textView =findViewById(R.id.textView2);
        final EditText editText1 = findViewById(R.id.editTextNumber);
        final EditText editText2 = findViewById(R.id.editTextNumber2);
        Button botonCalcular =findViewById(R.id.button);



    botonCalcular.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int numero1=0;
        int numero2=0;
        numero1 =Integer.parseInt(editText1.getText().toString());
        numero2 =Integer.parseInt(editText2.getText().toString());
        int sumar = (numero1+numero2);
        textView.setText(" Resultado: "+sumar);
    }
    });

    }


    private int add (String values) {
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() == 3){
            String valuesArray[] = values.split(",");
            int result = Integer.parseInt(valuesArray[0]) + Integer.parseInt(valuesArray[1]);
            return result;
        } else {
            return Integer.parseInt(values);
        }
        }
    }