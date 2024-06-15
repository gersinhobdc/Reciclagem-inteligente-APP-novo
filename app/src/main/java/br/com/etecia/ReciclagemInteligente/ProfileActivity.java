package br.com.etecia.ReciclagemInteligente;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import br.com.etecia.myapp.R;
public void fetchUserData(int userId) {
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL(Api.URL_READ_USER + "&id=" + userId);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setReadTimeout(10000);
                conn.setConnectTimeout(15000);
                conn.setDoInput(true);
                conn.connect();

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                StringBuilder sb = new StringBuilder();

                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
                br.close();

                String jsonString = sb.toString();
                // Aqui você converte o jsonString para um objeto User usando um parser JSON
                // Atualize os TextViews com os dados do usuário

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
    thread.start();


    class ProfileActivity extends AppCompatActivity {

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





