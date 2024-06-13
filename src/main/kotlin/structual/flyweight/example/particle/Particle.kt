package structual.flyweight.example.particle

import java.awt.Color

// Легковес, содержащий общее состояние движущихся частиц (MovingParticle)
data class Particle(
    val color: Color,
    val spritePath: String,
)
