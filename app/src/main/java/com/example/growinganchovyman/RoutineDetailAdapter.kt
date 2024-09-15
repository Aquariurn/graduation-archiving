package com.example.growinganchovyman

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.growinganchovyman.databinding.WorkoutItemBinding

class RoutineDetailAdapter(
    private val workoutList: List<String>
) : RecyclerView.Adapter<RoutineDetailAdapter.RoutineDetailViewHolder>(){

    inner class RoutineDetailViewHolder(val binding: WorkoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(workoutName: String) {
            binding.workoutName.text = workoutName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineDetailViewHolder {
        val binding = WorkoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoutineDetailViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoutineDetailViewHolder, position: Int) {
        holder.bind(workoutList[position])
    }

    override fun getItemCount(): Int {
        return workoutList.size
    }
}