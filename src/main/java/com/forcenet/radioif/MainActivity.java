package com.forcenet.radioif;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // System Title bar/ActionBar par app ka naam set karne ke liye
        if (getActionBar() != null) {
            getActionBar().setTitle("ForceNet");
        }

        Button btnAndroid11Minus = (Button) findViewById(R.id.btnAndroid11Minus);
        Button btnAndroid11Plus = (Button) findViewById(R.id.btnAndroid11Plus);
        Button btnLegacy = (Button) findViewById(R.id.btnLegacy);
        Button btnDev = (Button) findViewById(R.id.btnDev);

        btnAndroid11Minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    launchRadioInfo("com.android.settings", "com.android.settings.Settings$TestingSettingsActivity");
                }
            });

        btnAndroid11Plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    launchRadioInfo("com.android.phone", "com.android.phone.settings.RadioInfo");
                }
            });

        btnLegacy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    launchRadioInfo("com.android.settings", "com.android.settings.TestingSettings");
                }
            });

        btnDev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alexsifatrayhan.github.io/about-me/"));
                        startActivity(browserIntent);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Browser not found", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    private void launchRadioInfo(String packageName, String className) {
        try {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setComponent(new ComponentName(packageName, className));
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Package mismatch, try another button.", Toast.LENGTH_SHORT).show();
        }
    }
}

