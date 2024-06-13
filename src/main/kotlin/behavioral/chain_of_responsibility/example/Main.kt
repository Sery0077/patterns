package behavioral.chain_of_responsibility.example

import behavioral.chain_of_responsibility.example.views.Button
import behavioral.chain_of_responsibility.example.views.TextView
import behavioral.chain_of_responsibility.example.views.TouchEvent
import behavioral.chain_of_responsibility.example.views.TouchEventType
import behavioral.chain_of_responsibility.example.views.list_view.ListView
import behavioral.chain_of_responsibility.example.views.list_view.TouchInterceptorListView

fun main() {
    val touchEvent = TouchEvent(
        type = TouchEventType.DOWN,
        x = 0,
        y = 0,
    )

    val listView = ListView()
    val embeddedListView = ListView()
    val touchInterceptorListView = TouchInterceptorListView()

    listView.add(TextView())
    listView.add(Button())
    listView.add(TextView())
    listView.dispatchTouchEvent(touchEvent) // TextView handle event; Button handle event; т.к. Button перехватывает и обрабатывает нажатие

    touchInterceptorListView.add(TextView())
    touchInterceptorListView.add(Button())
    touchInterceptorListView.dispatchTouchEvent(touchEvent) // TouchInterceptorListView handle touch event; т.к. TouchInterceptorListView перехватывает и обрабатывает нажатие

    embeddedListView.add(TextView())
    embeddedListView.add(ListView(mutableListOf(TextView())))
    listView.removeAll()
    listView.add(embeddedListView)
    listView.dispatchTouchEvent(touchEvent) // TextView handle event; TextView handle event; т.к. иерархия ListView -> (ListView) -> (TextView, (ListView -> TextView))
}