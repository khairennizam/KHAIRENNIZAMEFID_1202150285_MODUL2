package com.example.khairennizamefid.khairennizamefid_1202150285_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity {

    private Spinner spMeja;
    private EditText Nama;
    private Button btpilih;
    private String lblNoMeja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        spMeja = (Spinner) findViewById(R.id.spinner2);

        ArrayList<String> list = isiDataMeja();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spMeja.setAdapter(dataAdapter);
        btpilih = (Button) findViewById(R.id.button_pilih);
        Nama = (EditText) findViewById(R.id.editText_name);
        Nama.setText("khairen");
    }

    public ArrayList<String> isiDataMeja(){
        int maks = 20;
        ArrayList<String> data = new ArrayList<>();
        for(int i=1; i<=maks;i++){data.add("Meja "+i);}
        return data;
    }

    public void Psn(View view) {
        String nomejax, namax;
        nomejax = String.valueOf(spMeja.getSelectedItem());
        namax = Nama.getText().toString();
        Toast.makeText(this, nomejax+" atas Nama "+namax+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));

    }
}