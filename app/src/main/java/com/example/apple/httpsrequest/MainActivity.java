package com.example.apple.httpsrequest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HTTPSUtils customTrust = new HTTPSUtils(this);

        try {
            customTrust.run();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
