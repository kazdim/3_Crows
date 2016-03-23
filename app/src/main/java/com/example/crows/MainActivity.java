package com.example.crows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounter;
    private int mCount = 0;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfoTextView = (TextView)findViewById(R.id.textView);
        mCrowsCounter = (Button)findViewById(R.id.buttonCrowsCounter);
        mCrowsCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
        }

    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty!");

    }
}
