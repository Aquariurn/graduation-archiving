package com.example.growinganchovyman

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.growinganchovyman.databinding.ActivityRoutineDetailBinding
import kotlin.math.log

class RoutineDetailActivity : AppCompatActivity() {
    private lateinit var adapter: RoutineDetailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRoutineDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        val intent = intent
        val routineId = intent.getIntExtra("routineId", -1)
        val workoutNames = intent.getStringArrayListExtra("workoutNames")?.toList() ?: emptyList()
        Log.d("검사용", workoutNames.toString())
        Log.d("검사용", routineId.toString())
        adapter = RoutineDetailAdapter(workoutNames)
        binding.detailRecyclerView.adapter = adapter
        binding.detailRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}