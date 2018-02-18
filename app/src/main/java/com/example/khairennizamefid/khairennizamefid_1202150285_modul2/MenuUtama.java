package com.example.khairennizamefid.khairennizamefid_1202150285_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MenuUtama extends AppCompatActivity {

    private RadioGroup RG;
    private RadioButton RB_DineIn, RB_TakeAway;
    private Button btpesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        //DEKLARASI
        RG = (RadioGroup) findViewById(R.id.rg_Menu);
        RB_DineIn =(RadioButton) findViewById(R.id.rb_DineIn);
        RB_TakeAway = (RadioButton) findViewById(R.id.rb_TakeAway);
        btpesan = (Button) findViewById(R.id.bt_pesan);

    }


    //onclick pada button pesan
    public void Pesan(View view) {
        int select = RG.getCheckedRadioButtonId();
        if (select == RB_DineIn.getId()){
            Intent ab = new Intent(MenuUtama.this,DineIn.class);
            startActivity(ab);
            Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_LONG).show();
            //selesai splashscreen
            this.finish();
        }else if (select == RB_TakeAway.getId()){
            Intent bc = new Intent(MenuUtama.this,TakeAway.class);
            startActivity(bc);
            Toast.makeText(MenuUtama.this, "Take Away", Toast.LENGTH_LONG).show();
            //selesai splashscreen
            this.finish();
        }
    }


}
