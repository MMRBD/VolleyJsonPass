package com.example.mokle.volleyjsonpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button getInfoBtn;
    TextView nametxt, emailtxt, mobiletxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getInfoBtn = (Button) findViewById(R.id.getIfoBtn);
        nametxt = (TextView) findViewById(R.id.nameTextView);
        emailtxt = (TextView) findViewById(R.id.emailtextView);
        mobiletxt = (TextView) findViewById(R.id.mobiletextView);

        getInfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
