package com.example.copao.doctorclinic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner bloodTypeSpinner = (Spinner) findViewById(R.id.bloodType);
        ArrayAdapter<CharSequence> bloodTypeAdapter = ArrayAdapter.createFromResource( this, R.array.bloodType, android.R.layout.simple_spinner_item);

        bloodTypeAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        bloodTypeSpinner.setAdapter(bloodTypeAdapter);

        bloodTypeSpinner.setSelection(0);

        Button clickMe = (Button) findViewById(R.id.send);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Formulario recibido", Toast.LENGTH_LONG).show();
            }
        });
    }
}
