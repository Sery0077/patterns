package abstract_fabric.example.fabric

import abstract_fabric.example.lamp.AmazonLamp
import abstract_fabric.example.lamp.Lamp
import abstract_fabric.example.speaker.AmazonSpeaker
import abstract_fabric.example.speaker.Speaker

class AmazonFactory: SmartHomeFactory {
    override fun createSpeaker(): Speaker {
        return AmazonSpeaker()
    }

    override fun createLamp(): Lamp {
        return AmazonLamp()
    }
}