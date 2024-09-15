package com.example.growinganchovyman

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.growinganchovyman.databinding.RoutineItemBinding
import com.example.growinganchovyman.databinding.RoutineWorkoutItemBinding
import com.example.growinganchovyman.databinding.WorkoutItemBinding

class WorkoutNamesAdapter(
    private val workoutNames: List<String>
) : RecyclerView.Adapter<WorkoutNamesAdapter.WorkoutNameViewHolder>(){

    inner class WorkoutNameViewHolder(val binding: RoutineWorkoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(workoutName: String) {
            binding.workoutName.text = workoutName
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WorkoutNameViewHolder {
        val binding = RoutineWorkoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WorkoutNameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WorkoutNameViewHolder, position: Int) {
        holder.bind(workoutNames[position])
    }

    override fun getItemCount(): Int {
        return workoutNames.size
    }
}