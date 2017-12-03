package com.example.ketemploy.uts_pbb;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin, btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_pass);
        btnLogin = (Button)findViewById(R.id.btn_login);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("admin")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, Menu.class);
                    Login.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }

        });

    }
}