package abstract_fabric.fabric

import abstract_fabric.lamp.AmazonLamp
import abstract_fabric.lamp.Lamp
import abstract_fabric.speaker.AmazonSpeaker
import abstract_fabric.speaker.Speaker

class AmazonFactory: SmartHomeFactory {
    override fun createSpeaker(): Speaker {
        return AmazonSpeaker()
    }

    override fun createLamp(): Lamp {
        return AmazonLamp()
    }
}