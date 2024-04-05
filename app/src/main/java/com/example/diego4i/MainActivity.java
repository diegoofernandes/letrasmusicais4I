package com.example.diego4i;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

        public void sortear(View view) {

        int musica = new Random().nextInt(5);

        TextView textResultado = findViewById(R.id.TextResultado);

        textResultado.setText("Resultado: " + musica);
        switch (musica) {
            case 0:
                textResultado.setText("\"Ela só quer paz, ela só quer paz\n" +
                        "Mas cê vai, vai, vai na base da maldade\n" +
                        "Ela só quer paz, ela só quer paz\n" +
                        "Mas cê vai, vai, vai na base da maldade\" - \"Só Quer Paz\" by Projota");
                break;
            case 1:
                textResultado.setText("\"Você já reparou que as rosas da corte têm espinhos?\n" +
                        "Que as águas do oceano têm sal?\n" +
                        "Que a maior riqueza do homem, não é o dinheiro?\n" +
                        "Nem o ouro, nem a prata, mas o amor?\" - \"O Sol\" by Vitor Kley");
                break;
            case 2:
                textResultado.setText("\"Tudo o que eu quero é ser feliz\n" +
                        "Andar tranquilamente na favela onde eu nasci\n" +
                        "E poder me orgulhar\n" +
                        "E ter a consciência que o pobre tem seu lugar\" - \"Favela Vive 3\" by Racionais MC's");
                break;
            case 3:
                textResultado.setText("\"Tô te querendo, tô te querendo\n" +
                        "Coração batendo, tô te querendo\n" +
                        "Tô te querendo, tô te querendo\n" +
                        "Se você quer saber, eu tô te querendo\" - \"Tô Te Querendo\" by João Bosco & Vinícius");
                break;
            case 4:
                textResultado.setText("\"Só sei que o tempo é rei\n" +
                        "Quando a explosão vem, a explosão vem\n" +
                        "Tudo aqui pode estar depois, nunca mais\" - \"Amei Te Ver\" by Tiago Iorc");
                break;
        }
    }
}