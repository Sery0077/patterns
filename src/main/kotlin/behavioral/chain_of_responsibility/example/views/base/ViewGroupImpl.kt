package behavioral.chain_of_responsibility.example.views.base

import behavioral.chain_of_responsibility.example.views.TouchEvent

abstract class ViewGroupImpl(protected val views: MutableList<View>) : ViewGroup {

    fun add(element: View) {
        views.add(element)
    }

    fun remove(element: View) {
        views.remove(element)
    }

    fun removeAll() {
        views.clear()
    }

    override fun dispatchTouchEvent(touchEvent: TouchEvent): Boolean {
        if (onInterceptTouchEvent(touchEvent)) {
            handleEvent(touchEvent)
            return true
        }

        views.forEach {
            if (it.dispatchTouchEvent(touchEvent)) {
                return true
            }
        }

        return false
    }
}