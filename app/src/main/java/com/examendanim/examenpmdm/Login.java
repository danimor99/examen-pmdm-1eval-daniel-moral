package com.examendanim.examenpmdm;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.examendanim.examenpmdm.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String usuario = binding.usuarioLogin.getText().toString().trim();
                String contraseña = binding.contrasenaLogin.getText().toString().trim();


                if (usuario.equals("root") && contraseña.equals("12345")) {

                    Toast.makeText(getApplicationContext(), "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, Main.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(getApplicationContext(), "Credenciales incorrectas. Prueba root 12345", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}