package behavioral.visitor.example.visitors

import behavioral.visitor.example.shapes.Circle
import behavioral.visitor.example.shapes.Dot

class JsonExportVisitor() : ShapeExportVisitor {
    override fun visitDot(dot: Dot) = buildString {
        append("dot: {")
        append("x: ${dot.x},")
        append("y: ${dot.y},")
        append("}")
    }

    override fun visitCircle(circle: Circle) = buildString {
        append("circle: {")
        append("x: ${circle.x},")
        append("y: ${circle.y},")
        append("radius: ${circle.radius},")
        append("}")
    }
}