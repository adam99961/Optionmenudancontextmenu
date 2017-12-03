package com.example.ketemploy.uts_pbb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button olahraga, about, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        olahraga= (Button) findViewById(R.id.olahraga);
        about= (Button) findViewById(R.id.about);
        btnExit = (Button) findViewById(R.id.btnExit);


        olahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,List_olahraga.class);
                Menu.this.startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,about.class);
                Menu.this.startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                finish();
            }
        });

    }
}