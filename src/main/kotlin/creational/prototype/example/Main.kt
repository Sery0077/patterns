package creational.prototype.example

import java.awt.Color

fun main() {
    val button1 = SimpleButton("Button 1", Color.RED)
    val button2 = button1.clone()
}