package com.example.advanceintentexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DialerIntentExample extends AppCompatActivity {


    Button btnCall;
    EditText txtNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer_intent_example);

        txtNum = findViewById(R.id.txtNum);
        btnCall = findViewById(R.id.btnDial);

        btnCall.setOnClickListener(x -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + txtNum.getText().toString()));
            startActivity(intent);
        });
    }
}