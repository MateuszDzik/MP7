package edu.illinois.cs.cs125.mp7;

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
    }

    ImageButton pleaseWork = (ImageButton)findViewById(R.id.map);

    pleaseWork.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    }

    );
}
