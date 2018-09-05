package com.example.ice.evento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_MATRICULA = 1;
    private Button btnAluno;
    private Button btnServidor;
    private Button btnExterno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnServidor = (Button) findViewById(R.id.btn_servidor);
        btnExterno = (Button) findViewById(R.id.btn_externo);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent,REQUEST_MATRICULA);
            }
        });


    }
}
