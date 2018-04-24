package edu.illinois.cs.cs125.mp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class USA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);

        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl("https://www.youtube.com/" +
                "watch?v=bNTUuAfWe00&t=0s&list=PLp8n0ijllfi64xJMXoLsB4NYxNt_fgoh5&index=34");
    }
}
