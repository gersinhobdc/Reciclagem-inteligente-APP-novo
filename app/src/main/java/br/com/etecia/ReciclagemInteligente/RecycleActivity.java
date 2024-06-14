package br.com.etecia.ReciclagemInteligente;

import android.os.Bundle;
import android.widget.TextView;

import br.com.etecia.ReciclagemInteligente.AppCompatActivity;
import br.com.etecia.myapp.R;

public class RecycleActivity extends AppCompatActivity {

    private TextView tvPontosDisponiveis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);

        // Inicialização dos componentes da tela
        tvPontosDisponiveis = (TextView) findViewById(R.id.tv_points);

        // Supondo que você tenha uma função para buscar os pontos do usuário
        atualizarPontosDisponiveis();
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