package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Continents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.continents);

        ImageButton africa = (ImageButton) findViewById(R.id.africa);

        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAfrica = new Intent(Continents.this, Africa.class);
                Continents.this.startActivity(openAfrica);
            }
        }

        );

        ImageButton asia = (ImageButton) findViewById(R.id.asia);

        asia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAsia = new Intent(Continents.this, Asia.class);
                Continents.this.startActivity(openAsia);
            }
        }

        );

        ImageButton europe = (ImageButton) findViewById(R.id.europe);

        europe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEurope = new Intent(Continents.this, Europe.class);
                Continents.this.startActivity(openEurope);
            }
        }

        );

        ImageButton northAmerica = (ImageButton) findViewById(R.id.northAmerica);

        northAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNorthAm = new Intent(Continents.this, NorthAmerica.class);
                Continents.this.startActivity(openNorthAm);
            }
        }

        );

        ImageButton oceania = (ImageButton) findViewById(R.id.oceania);

        oceania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openOceania = new Intent(Continents.this, Oceania.class);
                Continents.this.startActivity(openOceania);
            }
        }

        );

        ImageButton southAmerica = (ImageButton) findViewById(R.id.southAmerica);

        southAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSouthAm = new Intent(Continents.this, SouthAmerica.class);
                Continents.this.startActivity(openSouthAm);
            }
        }

        );
    }
}
