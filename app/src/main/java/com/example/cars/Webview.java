package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Intent intent = getIntent();
        int car = intent.getIntExtra("car", -1);
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        if (car >= 100 && car < 200) {
            switch (car) {
                case 100: {
                    webView.loadUrl(" https://www.carandbike.com/audi-cars/r8");
                }
                break;
                case 101: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/a3");
                }
                break;
                case 102: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/q7");
                }
                break;
                case 103: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/a8");
                }
                break;
                case 104: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/tt");
                }
                break;
                case 105: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/q3");
                }
                break;
                case 106: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/a4");
                }
                break;
                case 107: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/a6");
                }
                break;
                case 108: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/a5");
                }
                break;
                case 109: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/q5");
                }
                break;
                case 110: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/q8");
                }
                break;
                case 111: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/rs5");
                }
                break;
                case 112: {
                    webView.loadUrl("https://www.carandbike.com/audi-cars/rs7-sportback");
                }
                break;
            }
        } else if (car >= 200 && car < 300) {
            switch (car) {
                case 200: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/creta");
                }
                break;
                case 201: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/venue");
                }
                break;
                case 202: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/verna");
                }
                break;
                case 203: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/elite-i20");
                }
                break;
                case 204: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/grand-i10-nios");
                }
                break;
                case 205: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/aura");
                }
                break;
                case 206: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/new-santro");
                }
                break;
                case 207: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/i20-active");
                }
                break;
                case 208: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/kona-electric");
                }
                break;
                case 209: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/xcent");
                }
                break;
                case 210: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/tucson");
                }
                break;
                case 211: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/grand-i10");
                }
                break;
                case 212: {
                    webView.loadUrl("https://www.carandbike.com/hyundai-cars/elantra");
                }
                break;

            }
        } else if (car >= 300 && car < 400) {
            switch (car) {
                case 300: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/altroz");
                }
                break;
                case 301: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/nexon");
                }
                break;
                case 302: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tiago");
                }
                break;
                case 303: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/harrier");
                }
                break;
                case 304: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/nexon-ev");
                }
                break;
                case 305: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/nano");
                }
                break;
                case 306: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tigor");
                }
                break;
                case 307: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/safari-storme");
                }
                break;
                case 308: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/sumo");
                }
                break;
                case 309: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/hexa");
                }
                break;
                case 310: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tiago-nrg");
                }
                break;
                case 311: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tiago-jtp");
                }
                break;
                case 312: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/zest");
                }
                break;
                case 313: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tigor-ev");
                }
                break;
                case 314: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/bolt");
                }
                break;
                case 315: {
                    webView.loadUrl("https://www.carandbike.com/tata-cars/tigor-jtp");
                }
                break;

            }
        } else if (car >= 400 && car < 500) {
            switch (car) {
                case 400: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/fortuner");
                }
                break;
                case 401: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/innova-crysta");
                }
                break;
                case 402: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/glanza");
                }
                break;
                case 403: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/land-cruiser");
                }
                break;
                case 404: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/vellfire");
                }
                break;
                case 405: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/etios");
                }
                break;
                case 406: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/etios-liva");
                }
                break;
                case 407: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/land-cruiser-prado");
                }
                break;
                case 408: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/camry");
                }
                break;
                case 409: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/yaris");
                }
                break;
                case 410: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/corolla-altis");
                }
                break;
                case 411: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/etios-cross");
                }
                break;
                case 412: {
                    webView.loadUrl("https://www.carandbike.com/toyota-cars/prius");
                }
                break;

            }
        } else if (car >= 500 && car < 600) {
            switch (car) {
                case 500: {
                    webView.loadUrl("https://www.carandbike.com/renault-cars/kwid");
                }
                break;
                case 501: {
                    webView.loadUrl("https://www.carandbike.com/renault-cars/triber");
                }
                break;
                case 502: {
                    webView.loadUrl("https://www.carandbike.com/renault-cars/duster");
                }
                break;
                case 503: {
                    webView.loadUrl("https://www.carandbike.com/renault-cars/captur");
                }
                break;
                case 504: {
                    webView.loadUrl("https://www.carandbike.com/renault-cars/lodgy");
                }
                break;
            }
        }
    }
}