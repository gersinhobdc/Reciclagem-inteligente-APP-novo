package br.com.etecia.ReciclagemInteligente;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.com.etecia.myapp.R;

public class RewardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
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
    }

    public void setContentView(int activityRewards) {
    }
}