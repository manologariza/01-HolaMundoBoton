package com.example.manolo.a01_holamundoboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);

    }
    public void apagar(View v){
        finish();
    }

    public void pulsar(View v){
        tv1.setVisibility(View.VISIBLE);
    }

}
