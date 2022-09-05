package com.example.kalkulatorafmv25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editBilX, editBilY;
    Button tambah, kurang, kali, bagi;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBilX = (EditText) findViewById(R.id.editBilX);
        editBilY = (EditText) findViewById(R.id.editBilY);
        txthasil = (TextView) findViewById(R.id.txthasil);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bilanganX = Integer.parseInt(editBilX.getText().toString());
                int bilanganY = Integer.parseInt(editBilY.getText().toString());

                int hasil = bilanganX + bilanganY;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bilanganX = Integer.parseInt(editBilX.getText().toString());
                int bilanganY = Integer.parseInt(editBilY.getText().toString());

                int hasil = bilanganX - bilanganY;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bilanganX = Integer.parseInt(editBilX.getText().toString());
                int bilanganY = Integer.parseInt(editBilY.getText().toString());

                int hasil = bilanganX * bilanganY;
                txthasil.setText(String.valueOf(hasil));
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bilanganX = Integer.parseInt(editBilX.getText().toString());
                int bilanganY = Integer.parseInt(editBilY.getText().toString());

                int hasil = bilanganX / bilanganY;
                txthasil.setText(String.valueOf(hasil));
            }
        });
    }
}