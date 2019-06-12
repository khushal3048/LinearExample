package com.example.a1894219.linearexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    String unm, upass;

    TextView txt_nm, txt_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//        Using Bundle Object

        
        Bundle bundle = getIntent().getExtras();

        unm = bundle.getString("un");
        upass = bundle.getString("ps");

//        Using Normal Intent Object

    /*    Intent i = getIntent();

        unm = i.getStringExtra("un");
        upass = i.getStringExtra("ps");
*/
        txt_nm = findViewById(R.id.txt_uname);
        txt_pass = findViewById(R.id.txt_pass);

        txt_nm.setText(unm);
        txt_pass.setText(upass);

    }
}
