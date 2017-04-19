package org.mentorschools.menuapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton = (Button)findViewById(R.id.startSecondActivityBtn);
        activityButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondaryActivity.class);
                startIntent.putExtra("org.mentorschools.MESSAGE", "Hello World!!!");
                startActivity(startIntent);
            }
        });

        Button mapBtn = (Button) findViewById(R.id.showMapBtn);
        mapBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String geoURI = "geo: 37.422, -122.0847?z=23";
                Uri geo = Uri.parse(geoURI);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, geo);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });

        Button webBtn = (Button) findViewById(R.id.showWebpageBtn);
        webBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String webURI = "http://ww.google.com";
                Uri web = Uri.parse(webURI);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, web);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

    }
}
