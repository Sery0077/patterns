package abstract_fabric.example

import abstract_fabric.example.fabric.AmazonFactory
import abstract_fabric.example.fabric.YandexFactory

fun main() {
    val ecosystem = Ecosystem.YANDEX
    val factory = when (ecosystem) {
        Ecosystem.YANDEX -> YandexFactory()
        Ecosystem.AMAZON -> AmazonFactory()
    }

    val speaker = factory.createSpeaker()
    speaker.sayHello()
}

enum class Ecosystem {
    YANDEX, AMAZON
}