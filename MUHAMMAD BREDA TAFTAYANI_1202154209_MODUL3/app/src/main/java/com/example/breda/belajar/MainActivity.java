package com.example.breda.belajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);

        if (username.getText().toString().equals("EAD")&&password.getText().toString().equals("moble")){
            Intent intent=new Intent(this,Main2Activity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Login berhasil",Toast.LENGTH_SHORT).show();
        }//apabila kondisi berhasill

        else{
            Toast.makeText(getApplicationContext(),"Login gagal",Toast.LENGTH_SHORT).show();
        }
    }
}
