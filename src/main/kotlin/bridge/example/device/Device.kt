package bridge.example.device

interface Device {
    var volume: Int

    fun enable()
    fun disable()
    fun isEnabled(): Boolean
}