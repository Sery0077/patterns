package behavioral.visitor.example.shapes

class Circle(val radius: Int, override val x: Int, override val y: Int) : Shape {

    override fun draw() {
        println("Draw circle at $x,$y with radius $radius")
    }
}