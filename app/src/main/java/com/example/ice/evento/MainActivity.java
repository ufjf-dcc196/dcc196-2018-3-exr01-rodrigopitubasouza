package com.example.ice.evento;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_MATRICULA = 1;
    public static final String ALUNO_NOME = "Nome Aluno" ;
    public static final String ALUNO_MATRICULA = "Matricula aluno";
    private static final int REQUEST_SERVIDOR = 2;
    public static final String SERVIDOR_NOME = "Nome Servidor";
    public static final String SERVIDOR_SIAPE = "SIAPE Servidor";
    private static final int REQUEST_EXTERNO = 3;
    public static final String EXTERNO_NOME = "Nome Externo";
    public static final String EXTERNO_EMAIL = "Email Externo";
    private int contAluno = 0;
    private int contServidor = 0;
    private int contExterno = 0;
    private TextView txtMensagem;
    private TextView txtAlunoCont;
    private TextView txtServidorCont;
    private TextView txtExternoCont;
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
        txtMensagem = (TextView) findViewById(R.id.txt_mensagem);
        txtAlunoCont = (TextView) findViewById(R.id.txt_aluno_cont);
        txtServidorCont = (TextView) findViewById(R.id.txt_servidor_cont);
        txtExternoCont = (TextView) findViewById(R.id.txt_externo_cont);
        txtAlunoCont.setText("Aluno: " + contAluno);
        txtServidorCont.setText("Servidor: " + contServidor);
        txtExternoCont.setText("Externo: " + contExterno);
        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivityForResult(intent,REQUEST_MATRICULA);
            }
        });
        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ServidorActivity.class);
                startActivityForResult(intent,REQUEST_SERVIDOR);
            }
        });
        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExternoActivity.class);
                startActivityForResult(intent,REQUEST_EXTERNO);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MainActivity.REQUEST_MATRICULA && resultCode == Activity.RESULT_OK && data != null) {
            Bundle bundleResultado = data.getExtras();
            String nome = bundleResultado.getString(MainActivity.ALUNO_NOME);
            String matricula = bundleResultado.getString(MainActivity.ALUNO_MATRICULA);
            txtMensagem.setText("Olá "+ nome+" de Matricula: " + matricula);
            contAluno++;
            txtAlunoCont.setText("Aluno: " + contAluno);
        }
        else if(requestCode == MainActivity.REQUEST_SERVIDOR && resultCode == Activity.RESULT_OK && data != null){
            Bundle bundleResultado = data.getExtras();
            String nome = bundleResultado.getString(MainActivity.SERVIDOR_NOME);
            String siape = bundleResultado.getString(MainActivity.SERVIDOR_SIAPE);
            txtMensagem.setText("Olá "+ nome+" de SIAPE: " + siape);
            contServidor++;
            txtServidorCont.setText("Servidor: " + contServidor);
        }
        else if(requestCode == MainActivity.REQUEST_EXTERNO && resultCode == Activity.RESULT_OK && data != null){
            Bundle bundleResultado = data.getExtras();
            String nome = bundleResultado.getString(MainActivity.EXTERNO_NOME);
            String email = bundleResultado.getString(MainActivity.EXTERNO_EMAIL);
            txtMensagem.setText("Olá "+ nome+" de EMAIL: " + email);
            contExterno++;
            txtExternoCont.setText("Externo: " + contExterno);
        }
    }
}
