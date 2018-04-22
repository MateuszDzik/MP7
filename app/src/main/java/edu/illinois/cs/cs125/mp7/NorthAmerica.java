package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.JarURLConnection;
import java.net.NoRouteToHostException;

public class NorthAmerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_america);

        ImageButton canada = (ImageButton) findViewById(R.id.canada);

        canada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCanada = new Intent(NorthAmerica.this, Canada.class);
                NorthAmerica.this.startActivity(openCanada);
            }
        }

        );

        ImageButton costaRica = (ImageButton) findViewById(R.id.costaRica);

        costaRica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCostaRica = new Intent(NorthAmerica.this, CostaRica.class);
                NorthAmerica.this.startActivity(openCostaRica);
            }
        }

        );

        ImageButton cuba = (ImageButton) findViewById(R.id.cuba);

        cuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openCuba = new Intent(NorthAmerica.this, Cuba.class);
                NorthAmerica.this.startActivity(openCuba);
            }
        }

        );

        ImageButton jamaica = (ImageButton) findViewById(R.id.jamaica);

        jamaica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openJamaica = new Intent(NorthAmerica.this, Jamaica.class);
                NorthAmerica.this.startActivity(openJamaica);
            }
        }

        );

        ImageButton mexico = (ImageButton) findViewById(R.id.mexico);

        mexico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMexico = new Intent(NorthAmerica.this, Mexico.class);
                NorthAmerica.this.startActivity(openMexico);
            }
        }

        );

        ImageButton usa = (ImageButton) findViewById(R.id.usa);

        usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openUSA = new Intent(NorthAmerica.this, USA.class);
                NorthAmerica.this.startActivity(openUSA);
            }
        }

        );
    }
}
