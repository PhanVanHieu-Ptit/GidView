package com.example.gidview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvTen;
    String[] arrayName = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    ArrayList<HinhAnh> arrayImage;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        gvTen = (GridView) findViewById(R.id.gridviewTen);
//
//        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayName);
//
//        gvTen.setAdapter(adapter);
//        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, arrayName[position], Toast.LENGTH_SHORT).show();
//            }
//        });
        AnhXa();

        adapter = new HinhAnhAdapter(this, R.layout.dong_hinh_anh,arrayImage);
        gvTen.setAdapter(adapter);
        gvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayImage.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void AnhXa(){
        gvTen = (GridView) findViewById(R.id.gridviewTen);
        arrayImage = new ArrayList<>();
        arrayImage.add(new HinhAnh("Chom Chom",R.drawable.chomchom));
        arrayImage.add(new HinhAnh("Dau Tay",R.drawable.dau_tay));
        arrayImage.add(new HinhAnh("Dua Gang",R.drawable.dua_gang));
        arrayImage.add(new HinhAnh("Dua Luoi",R.drawable.dua_luoi));
        arrayImage.add(new HinhAnh("Mang Cau",R.drawable.mang_cau));
        arrayImage.add(new HinhAnh("Mang Cut",R.drawable.mang_cut));
        arrayImage.add(new HinhAnh("Tao Do",R.drawable.tao));
        arrayImage.add(new HinhAnh("Thanh Long",R.drawable.thanh_long));
        arrayImage.add(new HinhAnh("Bap Vang",R.drawable.trai_bap));
        arrayImage.add(new HinhAnh("Bo Sap",R.drawable.trai_bo));
        arrayImage.add(new HinhAnh("Buoi Hong",R.drawable.trai_buoi));
        arrayImage.add(new HinhAnh("KiWi Xanh",R.drawable.trai_kiwi));
        arrayImage.add(new HinhAnh("Le Vang",R.drawable.trai_le));
        arrayImage.add(new HinhAnh("Nhan Xuong",R.drawable.trai_nhan));
        arrayImage.add(new HinhAnh("Xoai Cat",R.drawable.trai_xoai));
        arrayImage.add(new HinhAnh("Dao Tien",R.drawable.traidao));
        arrayImage.add(new HinhAnh("Nho My",R.drawable.trainho));
        arrayImage.add(new HinhAnh("Oi Xanh",R.drawable.traioi));
    }
}