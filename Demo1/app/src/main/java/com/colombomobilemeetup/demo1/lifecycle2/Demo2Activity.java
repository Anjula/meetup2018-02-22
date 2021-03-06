package com.colombomobilemeetup.demo1.lifecycle2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.colombomobilemeetup.demo1.CountChangeListener;
import com.colombomobilemeetup.demo1.R;

public class Demo2Activity extends AppCompatActivity implements CountChangeListener {

    TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_23);
        textViewCount = findViewById(R.id.textViewCount);
        Counter.bind(this, this);
    }

    @Override
    public void onCount(final int count) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textViewCount.setText("" + count);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
