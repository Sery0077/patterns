package creational.abstract_fabric.example.fabric

import creational.abstract_fabric.example.lamp.Lamp
import creational.abstract_fabric.example.lamp.YandexLamp
import creational.abstract_fabric.example.speaker.Speaker
import creational.abstract_fabric.example.speaker.YandexSpeaker

class YandexFactory: SmartHomeFactory {

    override fun createSpeaker(): Speaker {
        return YandexSpeaker()
    }

    override fun createLamp(): Lamp {
        return YandexLamp()
    }
}