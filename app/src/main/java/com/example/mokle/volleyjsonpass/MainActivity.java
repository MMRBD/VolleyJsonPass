package com.example.mokle.volleyjsonpass;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button getInfoBtn;
    TextView nametxt, emailtxt, mobiletxt;
    String jsonURL =  "http://192.168.0.105/getinfo.php";

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
                JsonObjectRequest jRequest = new JsonObjectRequest(Request.Method.POST, jsonURL, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
            }
        });
    }
}
