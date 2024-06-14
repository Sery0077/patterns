package behavioral.visitor.example.visitors

import behavioral.visitor.example.shapes.Circle
import behavioral.visitor.example.shapes.Dot

interface ShapeExportVisitor {
    fun visitDot(dot: Dot): String
    fun visitCircle(circle: Circle): String
}