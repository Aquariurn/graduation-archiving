package com.example.growinganchovyman

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.growinganchovyman.databinding.ActivityRoutineBinding

class RoutineActivity : AppCompatActivity() {
    private lateinit var adapter: RoutineAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        val routineList = listOf(
            Routine(1, "등 / 이두 운동", listOf("데드리프트", "렛풀다운", "풀업"), 3),
            Routine(2, "가슴 / 삼두 운동", listOf("벤치프레스", "푸시업", "딥스"), 3),
            Routine(3, "하체 운동", listOf("스쿼트", "스플릿 스쿼트", "레그 익스텐션"), 3)
        )

        adapter = RoutineAdapter(routineList, this)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}