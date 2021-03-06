package com.example.class_manager.ui.Models;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.class_manager.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class searchClass_adapter extends FirebaseRecyclerAdapter<SearchClass, searchClass_adapter.viewHolder> {

    public searchClass_adapter(@NonNull FirebaseRecyclerOptions<SearchClass> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewHolder holder, int position, @NonNull SearchClass course_model) {
        holder.description.setText(course_model.getDescription());
        holder.name.setText(course_model.getName());
        holder.professor.setText(course_model.getProfessor());
        holder.img.setImageResource(R.drawable.avatar_3);
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_class_row,parent,false);
        return new viewHolder(view);
    }

    class viewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView name, description, professor;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.img1);
            name = (TextView)itemView.findViewById(R.id.course_name);
            description = (TextView)itemView.findViewById(R.id.course_description);
            professor = (TextView)itemView.findViewById(R.id.professor_name);
        }
    }

}
