package structual.flyweight.example.particle

import kotlin.random.Random

data class Vector(
    val startX: Int,
    val startY: Int,
    val endX: Int,
    val endY: Int,
)

fun randomVector(): Vector = Vector(
    startX = Random.nextInt(),
    startY = Random.nextInt(),
    endX = Random.nextInt(),
    endY = Random.nextInt(),
)
