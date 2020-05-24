package com.coolalex.genericmessenger

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    private lateinit var mainWebView : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun init() {
        mainWebView = findViewById(R.id.mainWebView)
        mainWebView.loadUrl("https://www.coolalex.com/CST8238/Index.php")
        mainWebView.settings.javaScriptEnabled = true
        mainWebView.settings.loadWithOverviewMode = true
        mainWebView.settings.useWideViewPort = true

    }
}

