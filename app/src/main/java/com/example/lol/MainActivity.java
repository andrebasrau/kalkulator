package com.example.lol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numb1, numb2, res;
    private Button tambah;
    private Button kurang;
    private Button kali;
    private Button bagi;
    private Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numb1= (EditText)findViewById(R.id.Number_1);
        numb2 = (EditText)findViewById(R.id.Number_2);
        res = (EditText)findViewById(R.id.res);

        tambah = (Button)findViewById(R.id.plus);
        kurang = (Button)findViewById(R.id.minus);
        kali = (Button)findViewById(R.id.kali);
        bagi = (Button)findViewById(R.id.bagi);
        reset = (Button)findViewById(R.id.reset);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numb1.getText().toString().equals("") || numb2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
                }
                else {
                    double angka1 = Double.valueOf(numb1.getText().toString());
                    double angka2 = Double.valueOf(numb2.getText().toString());
                    double hasil;
                    hasil = angka1 + angka2;
                    res.setText(String.valueOf(hasil));
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numb1.getText().toString().equals("") || numb2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
                }
                else {
                    double angka1 = Double.valueOf(numb1.getText().toString());
                    double angka2 = Double.valueOf(numb2.getText().toString());
                    double hasil;
                    hasil = angka1 - angka2;
                    res.setText(String.valueOf(hasil));
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numb1.getText().toString().equals("") || numb2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
                }
                else {
                    double angka1 = Double.valueOf(numb1.getText().toString());
                    double angka2 = Double.valueOf(numb2.getText().toString());
                    double hasil;
                    hasil = angka1 * angka2;
                    res.setText(String.valueOf(hasil));
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numb1.getText().toString().equals("") || numb2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "please enter some details", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (numb2.getText().toString().equals("0")){
                        Toast.makeText(MainActivity.this, "Cannot Divided By Zero", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double angka1 = Double.valueOf(numb1.getText().toString());
                        double angka2 = Double.valueOf(numb2.getText().toString());
                        double hasil;
                        hasil = angka1 / angka2;
                        res.setText(String.valueOf(hasil));
                    }

                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1.setText("");
                numb2.setText("");

            }
        });



    }
}
