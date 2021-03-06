package com.colombomobilemeetup.demo1.livedata2;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.colombomobilemeetup.demo1.R;

public class DemoLiveDataCustomActivity extends AppCompatActivity {

    TextView textViewCount3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textViewCount3 = findViewById(R.id.textViewCount3);
        CounterLiveData.get()
                .observe(this, integer -> textViewCount3.setText(integer.toString()));
    }
}
