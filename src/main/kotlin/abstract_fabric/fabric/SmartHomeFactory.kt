package abstract_fabric.fabric

import abstract_fabric.lamp.Lamp
import abstract_fabric.speaker.Speaker

interface SmartHomeFactory {
    fun createSpeaker(): Speaker
    fun createLamp(): Lamp
}