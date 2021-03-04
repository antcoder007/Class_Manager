package com.example.class_manager.ui.Models;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.class_manager.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class add_class extends AppCompatActivity {

    TextInputLayout class_name, class_description, class_professor;
    Button addClass;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_class);

        class_name = findViewById(R.id.input_className);
        class_description = findViewById(R.id.input_classDescription);
        class_professor = findViewById(R.id.input_classProfessor);
        addClass = findViewById(R.id.button_addClass);

        addClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("SearchClass");

                String name = class_name.getEditText().getText().toString();
                String description = class_description.getEditText().getText().toString();
                String professor = class_professor.getEditText().getText().toString();

                SearchClass addClass = new SearchClass(name, description, professor);
                reference.push().setValue(addClass);
                finish();
            }
        });

    }

}
