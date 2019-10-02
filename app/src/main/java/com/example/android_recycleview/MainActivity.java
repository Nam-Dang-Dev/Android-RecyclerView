package com.example.android_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewTask;
    TaskAdapter taskAdapter;
    public  List<Task> Tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Tasks.add(new Task("Nam", 23));
        Tasks.add( new Task("Lan", 34));
        Tasks.add( new Task("Huy", 23));
        Tasks.add( new Task("Nhung", 22));


        recyclerViewTask = findViewById(R.id.Recyckerview_task);
         recyclerViewTask.setLayoutManager(new LinearLayoutManager(this));

         taskAdapter = new TaskAdapter( this, Tasks);
         recyclerViewTask.setAdapter(taskAdapter);

    }
    public void clickAdd (View view){
        Task newTask = new Task("Tuan", 23);
        Tasks.add(newTask);
        taskAdapter.notifyDataSetChanged();
    }
    public void clicUpdate (View view){
        Tasks.get(0).Title = "Nam2";
        taskAdapter.notifyDataSetChanged();
    }
}
