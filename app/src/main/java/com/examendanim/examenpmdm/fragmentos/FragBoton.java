package com.examendanim.examenpmdm.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.examendanim.examenpmdm.Main;
import com.examendanim.examenpmdm.R;

public class FragBoton extends Fragment {
    int click;
    private boolean cliqueado;
    private int conteo_clicks;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragboton, container, false);
        Button button = view.findViewById(R.id.botonFragboton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!cliqueado){
                    Log.d("Bien", "Has cliqueado: " + conteo_clicks);
                    cliqueado = true;
                } else {

                }
                conteo_clicks++;
            }
        });

        return view;
    }
}