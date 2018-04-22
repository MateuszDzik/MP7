package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Europe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe);

        ImageButton denmark = (ImageButton) findViewById(R.id.denmark);

        denmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDenmark = new Intent(Europe.this, Denmark.class);
                Europe.this.startActivity(openDenmark);
            }
        }

        );

        ImageButton france = (ImageButton) findViewById(R.id.france);

        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFrance = new Intent(Europe.this, France.class);
                Europe.this.startActivity(openFrance);
            }
        }

        );

        ImageButton greece = (ImageButton) findViewById(R.id.greece);

        greece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGreece = new Intent(Europe.this, Greece.class);
                Europe.this.startActivity(openGreece);
            }
        }

        );

        ImageButton iceland = (ImageButton) findViewById(R.id.iceland);

        iceland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIceland = new Intent(Europe.this, Iceland.class);
                Europe.this.startActivity(openIceland);
            }
        }

        );

        ImageButton italy = (ImageButton) findViewById(R.id.italy);

        italy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openItaly = new Intent(Europe.this, Italy.class);
                Europe.this.startActivity(openItaly);
            }
        }

        );

        ImageButton spain = (ImageButton) findViewById(R.id.spain);

        spain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSpain = new Intent(Europe.this, Spain.class);
                Europe.this.startActivity(openSpain);
            }
        }

        );
    }
}
