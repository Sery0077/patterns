package creational.prototype.example

import java.awt.Color

class SimpleButton(
    override var text: String,
    override var color: Color
) : Button, Prototype {

    constructor(button: Button) : this(button.text, button.color)

    override fun click() {
        println("Clicked!")
    }

    override fun clone(): Prototype {
        return SimpleButton(this)
    }
}