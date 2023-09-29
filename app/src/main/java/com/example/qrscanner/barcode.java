package com.example.qrscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class barcode extends AppCompatActivity {
  scanned_barcode mycode;
    TextView barcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

        barcode=findViewById(R.id.barcode);
        mycode=new scanned_barcode();
        barcode.setText((CharSequence) mycode);
    }
}