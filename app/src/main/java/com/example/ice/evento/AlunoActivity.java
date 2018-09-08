package com.example.ice.evento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlunoActivity extends AppCompatActivity {
    EditText edtNome,edtMatricula;
    Button btnAlunoConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        edtNome = (EditText) findViewById(R.id.edt_aluno_nome);
        btnAlunoConfirmar = (Button) findViewById(R.id.btn_aluno_confirmar);
        edtMatricula = (EditText) findViewById(R.id.edt_matricula);

        btnAlunoConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.ALUNO_NOME, edtNome.getText().toString());
                resultado.putExtra(MainActivity.ALUNO_MATRICULA, edtMatricula.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });

        Toast.makeText(getApplicationContext(), "aluno onCreate()",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "aluno onStart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "aluno onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "aluno onPause()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "aluno onStop()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "aluno onRestart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "aluno onDestroy()",Toast.LENGTH_SHORT).show();

    }
}
