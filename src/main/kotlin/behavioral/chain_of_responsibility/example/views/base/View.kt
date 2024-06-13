package behavioral.chain_of_responsibility.example.views.base

import behavioral.chain_of_responsibility.example.views.TouchEvent

interface View {
    fun dispatchTouchEvent(touchEvent: TouchEvent): Boolean
    fun handleEvent(touchEvent: TouchEvent)
}