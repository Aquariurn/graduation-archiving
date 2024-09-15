package com.example.growinganchovyman

data class Routine(
    val id: Int,
    val routineName: String,
    val workoutName: List<String>,
    val workoutCount: Int
)
