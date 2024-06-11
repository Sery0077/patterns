package abstract_fabric

import abstract_fabric.fabric.AmazonFactory
import abstract_fabric.fabric.YandexFactory

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