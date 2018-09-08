package com.example.ice.evento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExternoActivity extends AppCompatActivity {
    EditText edtNome;
    EditText edtEmail;
    Button btnConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);
        edtNome = (EditText) findViewById(R.id.edt_externo_nome);
        edtEmail = (EditText) findViewById(R.id.edt_externo_email);
        btnConfirmar = (Button) findViewById(R.id.btn_externo_confirmar);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.EXTERNO_NOME,edtNome.getText().toString());
                resultado.putExtra(MainActivity.EXTERNO_EMAIL,edtEmail.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });
        Toast.makeText(getApplicationContext(), "externo onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "externo onStart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "externo onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "externo onPause()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "externo onStop()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "externo onRestart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "externo onDestroy()",Toast.LENGTH_SHORT).show();

    }

}
