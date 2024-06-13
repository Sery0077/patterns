package flyweight.example

import flyweight.example.particle.MovingParticleFactory
import flyweight.example.particle.Vector
import java.awt.Color

fun main() {
    val particleFactory = MovingParticleFactory()

    repeat(1_000_000) {
        particleFactory
            .getMovingParticle(
                color = Color.RED,
                spritePath = "spritePath",
                speed = 0,
                vector = Vector(startX = 0, startY = 0, endX = 0, endY = 0)
            )
            .draw()
    }
}
