package com.example.alunos.cotacao;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText_dolar = (EditText) findViewById(R.id.editText_dolar);
        final EditText editText_cotacao = (EditText) findViewById(R.id.editText_cotacao);
        final TextView textView_resultado = (TextView) findViewById(R.id.textView_resultado);
        Button button_calcular = (Button) findViewById(R.id.button_calcular);
        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dolar = Double.parseDouble(editText_dolar.getText().toString());
                Double cotacao = Double.parseDouble(editText_cotacao.getText().toString());
                Double total = dolar*cotacao;



                textView_resultado.setText(String.format("R$ %.2f",total));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
