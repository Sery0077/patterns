package behavioral.chain_of_responsibility.example.views.base

import behavioral.chain_of_responsibility.example.views.TouchEvent

interface ViewGroup : View {
    fun onInterceptTouchEvent(touchEvent: TouchEvent): Boolean
}