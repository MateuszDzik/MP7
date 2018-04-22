package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SouthAmerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_america);

        ImageButton argentina = (ImageButton) findViewById(R.id.argentina);

        argentina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openArgentina = new Intent(SouthAmerica.this, Argentina.class);
                SouthAmerica.this.startActivity(openArgentina);
            }
        }

        );

        ImageButton bolivia = (ImageButton) findViewById(R.id.bolivia);

        bolivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openBolivia = new Intent(SouthAmerica.this, Bolivia.class);
                SouthAmerica.this.startActivity(openBolivia);
            }
        }

        );

        ImageButton brazil = (ImageButton) findViewById(R.id.brazil);

        brazil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openBrazil = new Intent(SouthAmerica.this, Brazil.class);
                SouthAmerica.this.startActivity(openBrazil);
            }
        }

        );

        ImageButton colombia = (ImageButton) findViewById(R.id.colombia);

        colombia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openColombia = new Intent(SouthAmerica.this, Colombia.class);
                SouthAmerica.this.startActivity(openColombia);
            }
        }

        );

        ImageButton ecuador = (ImageButton) findViewById(R.id.ecuador);

        ecuador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEcuador = new Intent(SouthAmerica.this, Ecuador.class);
                SouthAmerica.this.startActivity(openEcuador);
            }
        }

        );

        ImageButton peru = (ImageButton) findViewById(R.id.peru);

        peru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPeru = new Intent(SouthAmerica.this, Peru.class);
                SouthAmerica.this.startActivity(openPeru);
            }
        }

        );
    }
}
