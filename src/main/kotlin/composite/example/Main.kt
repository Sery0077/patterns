package composite.example

import composite.example.product.Pen
import composite.example.product.Pencil

fun main() {
    val box = Box()
    box.add(Pencil())
    box.add(Pen())

    val enteredBox = Box(
        buildList {
            add(Pencil())
            add(Pencil())
        }.toMutableList()
    )

    box.add(enteredBox)

    assert(box.getCost() == 65) // 15 + 20 + 15 + 15
}