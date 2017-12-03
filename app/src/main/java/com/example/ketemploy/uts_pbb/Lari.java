package com.example.ketemploy.uts_pbb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lari extends Activity implements View.OnClickListener {
    Button Plus,Minus,Lakukan;
    EditText scoreText;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lari);
        Plus = (Button) findViewById(R.id.Plus);
        Minus = (Button) findViewById(R.id.minus);
        Lakukan = (Button) findViewById(R.id.Lakukan);
        scoreText = (EditText) findViewById(R.id.editText2);

        Plus.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Lakukan.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if (view==Plus){
            counter++;
            scoreText.setText(Integer.toString(counter));
        }
        else if (view==Minus){
            counter--;
            scoreText.setText(Integer.toString(counter));
        }
        else if (view==Lakukan){
            Toast.makeText(getApplicationContext(),"Anda akan melakukan"+ "\n" + "olahraga lari dengan" + "\n" + "waktu" + "\t" + scoreText.getText().toString() +"jam",Toast.LENGTH_LONG).show();
        }
    }
}