package com.example.class_manager.ui.Models;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.class_manager.MainActivity;
import com.example.class_manager.R;

public class groups_page_activity extends AppCompatActivity {

    ImageButton goto_sample;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groups_page_activity);



        goto_sample = findViewById(R.id.open_sample_group_page);


        goto_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(groups_page_activity.this, sample_group.class));
            }
        });



    }

}

/*(
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groups_page_activity);
    }
*/