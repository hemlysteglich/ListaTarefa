package com.example.aluno.listatarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario , senha;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.edtUsuario);
        senha = (EditText) findViewById(R.id.edtSenha);
        botao = (Button) findViewById(R.id.btnEntrar);
    }

    public void logar(View v)
    {
        if (usuario.getText().toString().equals("admin") &&
                senha.getText().toString().equals("12345")){
            Toast.makeText(this,"Senha correda",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(this,"Senha errada",Toast.LENGTH_SHORT).show();
        }
    }
}
