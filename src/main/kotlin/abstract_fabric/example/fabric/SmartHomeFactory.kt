package abstract_fabric.example.fabric

import abstract_fabric.example.lamp.Lamp
import abstract_fabric.example.speaker.Speaker

interface SmartHomeFactory {
    fun createSpeaker(): Speaker
    fun createLamp(): Lamp
}