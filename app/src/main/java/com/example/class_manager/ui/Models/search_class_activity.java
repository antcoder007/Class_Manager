package com.example.class_manager.ui.Models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.class_manager.MainActivity;
import com.example.class_manager.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;

public class search_class_activity extends AppCompatActivity {

    FloatingActionButton addClass;

    RecyclerView recView;

    searchClass_adapter course_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_class);

        addClass = findViewById(R.id.actionButton_addClass);

        addClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(search_class_activity.this, add_class.class));
            }
        });

        recView = findViewById(R.id.class_recView);
        recView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<SearchClass> options =
                new FirebaseRecyclerOptions.Builder<SearchClass>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("SearchClass"), SearchClass.class)
                        .build();

        course_adapter = new searchClass_adapter(options);
        recView.setAdapter(course_adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        course_adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        course_adapter.stopListening();
    }

}
