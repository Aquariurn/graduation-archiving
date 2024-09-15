package com.example.growinganchovyman

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.growinganchovyman.databinding.RoutineItemBinding

class RoutineAdapter(
    private val routineList: List<Routine>,
    private val context: Context)
    : RecyclerView.Adapter<RoutineAdapter.RoutineViewHolder>() {

    inner class RoutineViewHolder(val binding: RoutineItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(routine: Routine) {
            binding.routineName.text = routine.routineName
            binding.routineCount.text = "${routine.workoutCount} 종목"

            val workoutNamesAdapter = WorkoutNamesAdapter(routine.workoutName)
            binding.workoutNameRecyclerView.adapter = workoutNamesAdapter
            binding.workoutNameRecyclerView.layoutManager = LinearLayoutManager(context)

            binding.imageButton.setOnClickListener {
                val intent = Intent(context, RoutineDetailActivity::class.java)
                intent.putExtra("routineId", routine.id)
                intent.putExtra("workoutNames", ArrayList(routine.workoutName))
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : RoutineViewHolder {
        val binding = RoutineItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoutineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RoutineViewHolder, position: Int) {
        holder.bind(routineList[position])
    }

    override fun getItemCount(): Int = routineList.size
}