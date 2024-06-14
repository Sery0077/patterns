package behavioral.visitor.example.shapes

class Dot(override val x: Int, override val y: Int) : Shape {

    override fun draw() {
        println("Draw dot at $x, $y")
    }
}