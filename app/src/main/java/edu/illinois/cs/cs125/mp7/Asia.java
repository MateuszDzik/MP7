package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Asia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        ImageButton hongKong = (ImageButton) findViewById(R.id.hongKong);

        hongKong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHongKong = new Intent(Asia.this, HongKong.class);
                Asia.this.startActivity(openHongKong);
            }
        }

        );

        ImageButton india = (ImageButton) findViewById(R.id.india);

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIndia = new Intent(Asia.this, India.class);
                Asia.this.startActivity(openIndia);
            }
        }

        );

        ImageButton japan = (ImageButton) findViewById(R.id.japan);

        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openJapan = new Intent(Asia.this, Japan.class);
                Asia.this.startActivity(openJapan);
            }
        }

        );

        ImageButton philippines = (ImageButton) findViewById(R.id.philippines);

        philippines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPhilippines = new Intent(Asia.this, Philippines.class);
                Asia.this.startActivity(openPhilippines);
            }
        }

        );

        ImageButton taiwan = (ImageButton) findViewById(R.id.taiwan);

        taiwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openTaiwan = new Intent(Asia.this, Taiwan.class);
                Asia.this.startActivity(openTaiwan);
            }
        }

        );

        ImageButton vietnam = (ImageButton) findViewById(R.id.vietnam);

        vietnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openVietnam = new Intent(Asia.this, Vietnam.class);
                Asia.this.startActivity(openVietnam);
            }
        }

        );
    }
}
