package com.nitesh.leetsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class UPYEAR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upyear);
        ListView listupyear = findViewById(R.id.uppapersyear);
        listupyear.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(UPYEAR.this, UP2012.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(UPYEAR.this, UP2013.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(UPYEAR.this, UP2014.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(UPYEAR.this, UP2015.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(UPYEAR.this, UP2019.class);
                    startActivity(intent);
                }
            }
        });
    }
}
