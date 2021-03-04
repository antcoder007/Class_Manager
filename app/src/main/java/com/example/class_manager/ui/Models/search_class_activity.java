package com.example.class_manager.ui.Models;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.class_manager.MainActivity;
import com.example.class_manager.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class search_class_activity extends AppCompatActivity {

    FloatingActionButton addClass;

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

    }

}
