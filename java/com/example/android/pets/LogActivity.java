package com.example.android.pets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Shruti Pabboju on 4/4/2017.
 */

public class LogActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            Button button = (Button) findViewById(R.id.btn_login);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LogActivity.this, CatalogActivity.class);
                    startActivity(intent);
                }
            });

            TextView textView = (TextView) findViewById(R.id.link_signup);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LogActivity.this, SignActivity.class);
                    startActivity(intent);
                }
            });

        }

}