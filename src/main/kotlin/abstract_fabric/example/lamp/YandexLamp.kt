package abstract_fabric.example.lamp

class YandexLamp: Lamp {

    override fun on() {
        println("Yandex лампочка включена")
    }

    override fun off() {
        println("Yandex лампочка выключена")
    }
}