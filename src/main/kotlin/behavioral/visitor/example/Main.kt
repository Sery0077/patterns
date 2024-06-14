package behavioral.visitor.example

import behavioral.visitor.example.shapes.Circle
import behavioral.visitor.example.shapes.Dot
import behavioral.visitor.example.visitors.JsonExportVisitor

fun main() {
    val shapes = buildList {
        add(Dot(0, 0))
        add(Dot(24, 15))
        add(Circle(24, 15, 15))
    }

    val visitor = JsonExportVisitor()

    shapes.forEach {
        val jsonText = when (it) {
            is Dot -> visitor.visitDot(it)
            is Circle -> visitor.visitCircle(it)
            else -> throw IllegalArgumentException("Unknown shape type ${it.javaClass}")
        }

        println("Write to json $jsonText")
    }
}