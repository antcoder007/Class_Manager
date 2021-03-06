package com.example.class_manager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.class_manager.ui.Models.search_class_activity;
import com.example.class_manager.ui.Models.todo_page_activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.example.class_manager.ui.Models.groups_page_activity;

public class MainActivity extends AppCompatActivity {

    Button goto_class;
    Button goto_groups;
    Button goto_todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goto_class = findViewById(R.id.open_class);
        goto_groups = findViewById(R.id.open_group_page);
        goto_todo = findViewById(R.id.open_todo_page);

        goto_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, search_class_activity.class));
            }
        });

        goto_groups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, groups_page_activity.class));
            }
        });


        goto_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, todo_page_activity.class));
            }
        });

    }

}