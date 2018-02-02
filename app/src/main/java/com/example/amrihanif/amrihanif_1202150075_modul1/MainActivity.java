package com.example.amrihanif.amrihanif_1202150075_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText makanan;
    private EditText jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        makanan = (EditText)findViewById(R.id.makanan);
        String makan = makanan.getText().toString();
        jumlah = (EditText)findViewById(R.id.jumlah);
        String porsi = jumlah.getText().toString();
        intent.putExtra("tempat","EatBus");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "50000");
        startActivity(intent);
    }


    public void Abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        makanan = (EditText)findViewById(R.id.makanan);
        String makan = makanan.getText().toString();
        jumlah = (EditText)findViewById(R.id.jumlah);
        String porsi = jumlah.getText().toString();
        intent.putExtra("tempat","Abnormal");
        intent.putExtra("menu", makan);
        intent.putExtra("jumlah", porsi);
        intent.putExtra("Harga", "30000");
        startActivity(intent);
    }
}
