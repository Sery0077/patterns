package behavioral.chain_of_responsibility.example.views.list_view

import behavioral.chain_of_responsibility.example.views.TouchEvent
import behavioral.chain_of_responsibility.example.views.base.View
import behavioral.chain_of_responsibility.example.views.base.ViewGroupImpl

class ListView(views: MutableList<View> = arrayListOf()) : ViewGroupImpl(views) {

    override fun onInterceptTouchEvent(touchEvent: TouchEvent): Boolean {
        return false
    }

    override fun handleEvent(touchEvent: TouchEvent) {
        println("ListView handle touch event")
    }
}