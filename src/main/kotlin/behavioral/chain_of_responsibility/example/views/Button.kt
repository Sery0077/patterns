package behavioral.chain_of_responsibility.example.views

import behavioral.chain_of_responsibility.example.views.base.View

class Button : View {

    override fun dispatchTouchEvent(touchEvent: TouchEvent): Boolean {
        handleEvent(touchEvent)
        return true
    }

    override fun handleEvent(touchEvent: TouchEvent) {
        println("Button handle event")
    }
}