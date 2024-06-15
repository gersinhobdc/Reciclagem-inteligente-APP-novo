package br.com.etecia.ReciclagemInteligente;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import br.com.etecia.myapp.R;

public class RecycleActivity extends AppCompatActivity {

    private TextView tvPontosDisponiveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

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

        // Inicialização dos componentes da tela
        tvPontosDisponiveis = (TextView) tvPontosDisponiveis.findViewById(R.id.tv_points);

        // Supondo que você tenha uma função para buscar os pontos do usuário
        atualizarPontosDisponiveis();
    }

    public void setContentView(int activityRewards) {

    }

    private void atualizarPontosDisponiveis() {
        // Aqui você iria buscar os pontos disponíveis do usuário
        // Por exemplo, de uma API ou banco de dados local
        int pontos = buscarPontosDoUsuario();

        // Atualiza o texto com os pontos disponíveis
        tvPontosDisponiveis.setText("Você tem " + pontos + " pontos disponíveis para troca.");
    }

    private int buscarPontosDoUsuario() {
        // Implemente a lógica de busca dos pontos do usuário
        // Este é apenas um valor de exemplo
        return 100;
    }
}