package br.com.etecia.ReciclagemInteligente;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.com.etecia.myapp.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Configuração do BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.activity_recycle) {
                // Navegue para o fragmento de reciclagem
                return true;
            } else if (itemId == R.id.activity_rewards) {
                // Navegue para o fragmento de dinheiro
                return true;
            } else if (itemId == R.id.activity_profile) {
                // Navegue para o fragmento de perfil
                return true;
            } else {
                return false;
            }
        });

        // Configuração dos TextViews
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView cpfTextView = findViewById(R.id.cpfTextView);
        TextView enderecoTextView = findViewById(R.id.enderecoTextView);

        // Configuração do botão de atualização
        Button updateButton = findViewById(R.id.buttonUpdate);
        updateButton.setOnClickListener(v -> {
            // Chame a API para atualizar o perfil
        });
    }
}