package com.example.khairennizamefid.khairennizamefid_1202150285_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenu extends AppCompatActivity {

    private ArrayList<MenuModel> menumakanan;
    private String idMenu;
    private TextView nama, harga, deskripsi;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama = (TextView)findViewById(R.id.lblDetailNama);
        harga = (TextView)findViewById(R.id.lblDetailHarga);
        deskripsi = (TextView)findViewById(R.id.lblDetailDeskripsi);
        gambar = (ImageView) findViewById(R.id.lblDetailGambar);
//
        menumakanan = DaftarMenu.menuList;
        Intent q = getIntent();
        idMenu = q.getStringExtra("MenuID");
        Log.d("DETAILED MENU","ID:"+idMenu);
        MenuModel menu = menumakanan.get(Integer.parseInt(idMenu));
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +",- / Porsi");
        deskripsi.setText(menu.getDeskripsi());
        gambar.setImageResource(menu.getGambar());
    }
}
