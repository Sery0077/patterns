package structual.flyweight.example.particle

class MovingParticle(
    private val speed: Int,
    private val vector: Vector,
    private val particleState: Particle
) {

    fun draw() {
        println("Drawing moving particle ${particleState.spritePath} with color: ${particleState.color}, ")
    }

}