package com.example.spinnersencillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp;
     TextView tv;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            String [] elementos = {"Toledo", "Castrelos", "Lavadores", "Pereiró", "Bouzas", "Navia"};
            ArrayAdapter<String> adaptador;

            adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,elementos);
            Spinner sp = findViewById(R.id.spinner);
            sp.setAdapter(adaptador);
            sp.setSelection(0,false);
            sp.setOnItemSelectedListener(this);
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        tv=(TextView)findViewById(R.id.textView);
        sp= (Spinner)findViewById(R.id.spinner);
        tv.setText(sp.getSelectedItem().toString());
        }

        @Override
       public void onNothingSelected(AdapterView<?> adapterView) {
          tv=(TextView) findViewById(R.id.textView);
        tv.setText("no se ha selecionado nada");
        }
    }