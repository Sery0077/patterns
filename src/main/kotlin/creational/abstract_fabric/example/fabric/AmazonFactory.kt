package creational.abstract_fabric.example.fabric

import creational.abstract_fabric.example.lamp.AmazonLamp
import creational.abstract_fabric.example.lamp.Lamp
import creational.abstract_fabric.example.speaker.AmazonSpeaker
import creational.abstract_fabric.example.speaker.Speaker

class AmazonFactory: SmartHomeFactory {
    override fun createSpeaker(): Speaker {
        return AmazonSpeaker()
    }

    override fun createLamp(): Lamp {
        return AmazonLamp()
    }
}