package com.example.pradeep.mectrail1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class FacultyActivity extends AppCompatActivity  {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.mahindraecolecentrale.edu.in/faculties.php");
    }
}
