package com.nitesh.leetsolution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class PUYEAR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puyear);
        ListView listView = findViewById(R.id.pupapersyear);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(PUYEAR.this, PU2016.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(PUYEAR.this, PU2017.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(PUYEAR.this, PU2018.class);
                    startActivity(intent);
                }
            }
        });
    }
}
