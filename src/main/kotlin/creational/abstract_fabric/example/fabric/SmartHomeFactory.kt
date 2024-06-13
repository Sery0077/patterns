package creational.abstract_fabric.example.fabric

import creational.abstract_fabric.example.lamp.Lamp
import creational.abstract_fabric.example.speaker.Speaker

interface SmartHomeFactory {
    fun createSpeaker(): Speaker
    fun createLamp(): Lamp
}