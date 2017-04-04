package com.example.android.pets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Shruti Pabboju on 4/4/2017.
 */

public class SignActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button button = (Button) findViewById(R.id.btn_signup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignActivity.this, LogActivity.class);
                startActivity(intent);
            }
        });
    }
}
