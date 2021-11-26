package com.nitesh.leetsolution;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Pdf extends AppCompatActivity {
    ListView myPDFListView;
    DatabaseReference databaseReference;
    List<paperpdf> paperpdfs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        myPDFListView = findViewById(R.id.list);
        paperpdfs = new ArrayList<>();
        viewAllFiles();
        myPDFListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                paperpdf uploaderPdf = paperpdfs.get(position);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //      intent.setType(Intent.CATEGORY_APP_BROWSER);
                intent.setData(Uri.parse(uploaderPdf.getUrl()));
                startActivity(intent);
            }
        });
    }

    private void viewAllFiles() {
        databaseReference = FirebaseDatabase.getInstance().getReference("paperpdf");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    paperpdf paper = dataSnapshot1.getValue(paperpdf.class);
                    paperpdfs.add(paper);
                }
                String[] uploads = new String[paperpdfs.size()];
                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = paperpdfs.get(i).getName();
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, uploads);
                myPDFListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
