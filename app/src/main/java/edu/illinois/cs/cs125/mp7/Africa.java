package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Africa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        ImageButton egypt = (ImageButton) findViewById(R.id.egypt);

        egypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openEgypt = new Intent(Africa.this, Egypt.class);
                Africa.this.startActivity(openEgypt);
            }
        }

        );

        ImageButton kenya = (ImageButton) findViewById(R.id.kenya);

        kenya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openKenya = new Intent(Africa.this, Kenya.class);
                Africa.this.startActivity(openKenya);
            }
        }

        );

        ImageButton madagascar = (ImageButton) findViewById(R.id.madagascar);

        madagascar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMadagascar = new Intent(Africa.this, Madagascar.class);
                Africa.this.startActivity(openMadagascar);
            }
        }

        );

        ImageButton morocco = (ImageButton) findViewById(R.id.morocco);

        morocco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMorocco = new Intent(Africa.this, Morocco.class);
                Africa.this.startActivity(openMorocco);
            }
        }

        );
    }
}
