package com.example.khairennizamefid.khairennizamefid_1202150285_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

    }

    public void Pesanan(View view) {
        startActivity(new Intent(this, DaftarMenu.class)); //untuk menghubungkan dengan activity selanjutnya
    }


}
