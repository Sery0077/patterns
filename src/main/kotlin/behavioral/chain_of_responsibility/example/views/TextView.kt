package behavioral.chain_of_responsibility.example.views

import behavioral.chain_of_responsibility.example.views.base.View

class TextView : View {
    override fun dispatchTouchEvent(touchEvent: TouchEvent): Boolean {
        handleEvent(touchEvent)
        return false
    }

    override fun handleEvent(touchEvent: TouchEvent) {
        println("TextView handle event")
    }
}