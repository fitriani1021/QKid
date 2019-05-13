package com.fitriani.qkidkid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class soal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
    }

    public void Skip(View view) {
        Intent intent = new Intent(soal.this, skor.class);
        startActivity(intent);
    }
}
