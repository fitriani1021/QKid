package com.fitriani.qkidkid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class skor extends AppCompatActivity {

    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        keluar = (Button)findViewById((R.id.keluar));
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
    }

    public void Home(View view) {
        Intent intent = new Intent(skor.this, soal.class);
        startActivity(intent);
    }
}
