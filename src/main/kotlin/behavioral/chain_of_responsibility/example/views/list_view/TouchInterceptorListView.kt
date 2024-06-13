package behavioral.chain_of_responsibility.example.views.list_view

import behavioral.chain_of_responsibility.example.views.TouchEvent
import behavioral.chain_of_responsibility.example.views.base.View
import behavioral.chain_of_responsibility.example.views.base.ViewGroupImpl

class TouchInterceptorListView(views: MutableList<View> = arrayListOf()) : ViewGroupImpl(views) {

    override fun onInterceptTouchEvent(touchEvent: TouchEvent): Boolean {
        return true
    }

    override fun handleEvent(touchEvent: TouchEvent) {
        println("TouchInterceptorListView handle touch event")
    }
}