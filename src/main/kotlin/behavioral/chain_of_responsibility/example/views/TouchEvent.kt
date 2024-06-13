package behavioral.chain_of_responsibility.example.views

data class TouchEvent(
    val type: TouchEventType,
    val x: Int,
    val y: Int
)

enum class TouchEventType {
    UP, DOWN
}
