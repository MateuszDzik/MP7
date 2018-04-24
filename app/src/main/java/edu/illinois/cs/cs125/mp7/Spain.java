package edu.illinois.cs.cs125.mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Spain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spain);

        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl("https://www.youtube.com/" +
                "watch?v=n2ZvJd8aDRU&t=0s&list=PLp8n0ijllfi64xJMXoLsB4NYxNt_fgoh5&index=37");
    }
}
