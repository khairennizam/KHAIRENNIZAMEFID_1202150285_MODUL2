package com.example.khairennizamefid.khairennizamefid_1202150285_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Asam Padeh", 25000, R.drawable.asampadeh, "Asam Padeh (Asam Pedas) adalah salah satu masakan khas tradisional Minangkabau dan Melayu yang memiliki cita rasa asam dan pedas."));
        data.add(new MenuModel("Ayam Pop", 20000, R.drawable.ayampop, "Ayam Pop merupakan menu olahan makanan khas Sumatera Barat dan hampir selalu dijumpai disemua Restoran atau Rumah Makan Padang dengan berbagai versi dan bentuk olahan."));
        data.add(new MenuModel("Dendeng Balado", 23000, R.drawable.dendengbalado, "Dendeng Balado kami memiliki cita rasa yang khas dengan paduan resep dan bumbu yang sempurna akan memanjakan lidah anda."));
        data.add(new MenuModel("Gulai Ayam", 24000, R.drawable.gulaiayam, "Gulai Ayam adalah makanan yang identik dengan perayaan hari besar keagamaan seperti lebaran dan umum dijumpai di Restoran Padang."));
        data.add(new MenuModel("Gulai Cumi", 23000, R.drawable.gulaicumi, "Masakan asal Kota Padang ini sangat kaya dengan rempah dan bumbu. Gurihnya santan dan lezatnya daging cumi terasa pas dengan kuah berbumbu tajam."));
        data.add(new MenuModel("Gulai Tunjang Kikil", 26000, R.drawable.gulaitunjangkikil, "Gulai Tunjang - Kikil adalah masakan khas Sumatera Barat yang rasanya menggugah selera."));
        data.add(new MenuModel("Gulai Kepala Ikan Kakap", 76000, R.drawable.kepalakakap, "Gulai Kepala Kakap masih menjadi favorit dari pengunjung yang menikmati santapan di Restoran atau Rumah Makan Minangkabau. Dengan rasanya yang dan dimasak dengan santan khas masakan padang."));
        data.add(new MenuModel("Rendang Daging", 50000, R.drawable.rendangdaging, "Bercita rasa pedas yang menggunakan paduan bumbu dan rempah-rempah"));

        return data;
    }
}
