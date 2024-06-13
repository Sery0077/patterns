package flyweight.example.particle

import java.awt.Color

class MovingParticleFactory {
    private val particleStates = hashSetOf<Particle>()

    fun getMovingParticle(color: Color, spritePath: String, speed: Int, vector: Vector): MovingParticle {
        val particleState = particleStates.find { it.color == color && it.spritePath == spritePath }
            ?: Particle(color, spritePath).also { particleStates.add(it) }

        return MovingParticle(
            speed = speed,
            vector = vector,
            particleState = particleState
        )
    }
}