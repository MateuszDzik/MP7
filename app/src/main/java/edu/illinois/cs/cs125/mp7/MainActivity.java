package edu.illinois.cs.cs125.mp7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton earth = (ImageButton) findViewById(R.id.earth);

        earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMain2 = new Intent(MainActivity.this, Main2Activity.class);
                MainActivity.this.startActivity(openMain2);
            }
        }

        );
    }
}
