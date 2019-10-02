package com.example.android_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
        public  List<Task> Tasks;


    public TaskAdapter(MainActivity mainActivity, List<Task> tasks) {
        Tasks = tasks;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
            String infor = "";
            infor+= Tasks.get(position).Title +"    " + Tasks.get(position).Number;
            holder.tvView.setText(infor);

    }

    @Override
    public int getItemCount() {
        return Tasks.size();

    }

    class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView tvView;
        public TaskViewHolder(@NonNull View itemView) {
            super(itemView);
            tvView = itemView.findViewById(R.id.tvView);
        }
    }
    ;
}
