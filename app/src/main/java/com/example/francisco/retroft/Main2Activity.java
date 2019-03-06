package com.example.francisco.retroft;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText text_usuario;
    Button btn_consultar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text_usuario = (EditText) findViewById(R.id.txt_user);


        btn_consultar = (Button)findViewById(R.id.btn_consultar);


        btn_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("usuario",text_usuario.getText().toString());
                startActivity(intent);






            }
        });





    }
}
