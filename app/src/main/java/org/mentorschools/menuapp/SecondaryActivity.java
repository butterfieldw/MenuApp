package org.mentorschools.menuapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        String message = "no data from Intent";
        if (getIntent() != null) {

            if (getIntent().hasExtra("org.mentorschools.MESSAGE")) {
                message = getIntent().getStringExtra("org.mentorschools.MESSAGE");
            } else if (getIntent().hasExtra(getIntent().EXTRA_TEXT)) {
                message = getIntent().getStringExtra(getIntent().EXTRA_TEXT);
            }

        }

        TextView messageTv = (TextView) findViewById(R.id.textView);
        messageTv.setText(message);
    }
}
