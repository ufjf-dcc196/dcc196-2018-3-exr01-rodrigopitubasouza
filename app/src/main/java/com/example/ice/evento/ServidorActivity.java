package com.example.ice.evento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServidorActivity extends AppCompatActivity {
    EditText edtNome,edtSiape;
    Button btnConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);
        edtNome = (EditText) findViewById(R.id.edt_servidor_nome);
        edtSiape = (EditText) findViewById(R.id.edt_servidor_siape);
        btnConfirmar = (Button) findViewById(R.id.btn_servidor_confirmar);
        
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.SERVIDOR_NOME, edtNome.getText().toString());
                resultado.putExtra(MainActivity.SERVIDOR_SIAPE, edtSiape.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });
        Toast.makeText(getApplicationContext(), "servidor onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "servidor onStart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "servidor onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "servidor onPause()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "servidor onStop()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "servidor onRestart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "servidor onDestroy()",Toast.LENGTH_SHORT).show();

    }
    
}
