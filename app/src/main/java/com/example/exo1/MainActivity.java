package com.example.exo1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0; // Variable pour le compteur
    private TextView tvCounter; // TextView qui affiche le compteur

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupérer les vues depuis le fichier XML
        TextView textViewColor = findViewById(R.id.color);
        tvCounter = findViewById(R.id.tv_counter);
        Button btnToast = findViewById(R.id.btn_toast);
        Button btnIncrement = findViewById(R.id.btn_increment);

        // Configurer l'action pour le bouton TOAST
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Afficher un message Toast
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        // Configurer l'action pour le bouton COUNT
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Incrémenter le compteur et mettre à jour le TextView
                count++;
                tvCounter.setText(String.valueOf(count));
            }
        });
    }
}
