package com.example.latihan04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etNim = findViewById(R.id.etNim);
        final EditText etProdi = findViewById(R.id.etProdi);
        final EditText etTTL = findViewById(R.id.etTTL);
        final EditText etAlamat = findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            //mengosongkan  EditText
            etUsername.setText("");
            etNim.setText("");
            etProdi.setText("");
            etTTL.setText("");
            etAlamat.setText("");
            //meletakan kursor di username
            etUsername.requestFocus();
        });

        btLogin.setOnClickListener(v -> {
            //mengosongkan  EditText
            etUsername.setText("");
            etNim.setText("");
            etProdi.setText("");
            etTTL.setText("");
            etAlamat.setText("");
            //meletakan kursor di username
            etUsername.requestFocus();
            Toast.makeText(this, "Anda Sudah masuk", Toast.LENGTH_SHORT).show();
        });
     }
}
