package abstract_fabric.fabric

import abstract_fabric.lamp.Lamp
import abstract_fabric.lamp.YandexLamp
import abstract_fabric.speaker.Speaker
import abstract_fabric.speaker.YandexSpeaker

class YandexFactory: SmartHomeFactory {

    override fun createSpeaker(): Speaker {
        return YandexSpeaker()
    }

    override fun createLamp(): Lamp {
        return YandexLamp()
    }
}