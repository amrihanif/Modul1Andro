package com.example.amrihanif.amrihanif_1202150075_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView jumlah;
    TextView tempat;
    TextView porsi;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String hJumlah = intent.getStringExtra("jumlah");
        String hTempat = intent.getStringExtra("tempat");
        String hMenu = intent.getStringExtra("menu");
        String hHarga = intent.getStringExtra("Harga");
        int jHarga = Integer.valueOf(hHarga)*Integer.valueOf(hJumlah);

        jumlah = (TextView)findViewById(R.id.jumlahPorsi);
        jumlah.setText(hJumlah);
        tempat = (TextView)findViewById(R.id.tempat);
        tempat.setText(hTempat);
        porsi = (TextView)findViewById(R.id.namaMenu);
        porsi.setText(hMenu);
        harga = (TextView)findViewById(R.id.jumlahHarga);
        harga.setText(String.valueOf(jHarga));

        if (jHarga > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }
    }

}
