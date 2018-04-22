package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Oceania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        ImageButton australia = (ImageButton) findViewById(R.id.australia);

        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openAustralia = new Intent(Oceania.this, Australia.class);
                Oceania.this.startActivity(openAustralia);
            }
        }

        );

        ImageButton fiji = (ImageButton) findViewById(R.id.fiji);

        fiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFiji = new Intent(Oceania.this, Fiji.class);
                Oceania.this.startActivity(openFiji);
            }
        }

        );
    }
}
