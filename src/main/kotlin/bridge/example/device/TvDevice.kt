package bridge.example.device

class TvDevice : Device {
    override var volume: Int = 0
        set(value) {
            field = value
            println("Текущий уровень громкости $value")
        }

    private var isEnabled = false

    override fun enable() {
        println("Телевизор включен")
        isEnabled = true
    }

    override fun disable() {
        println("Телевизор выключен")
        isEnabled = false
    }

    override fun isEnabled(): Boolean = isEnabled
}