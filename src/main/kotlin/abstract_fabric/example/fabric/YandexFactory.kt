package abstract_fabric.example.fabric

import abstract_fabric.example.lamp.Lamp
import abstract_fabric.example.lamp.YandexLamp
import abstract_fabric.example.speaker.Speaker
import abstract_fabric.example.speaker.YandexSpeaker

class YandexFactory: SmartHomeFactory {

    override fun createSpeaker(): Speaker {
        return YandexSpeaker()
    }

    override fun createLamp(): Lamp {
        return YandexLamp()
    }
}