package bridge.example.remote

import bridge.example.device.Device

class RemoteController(private val device: Device) : Remote {

    override fun togglePower() {
        if (device.isEnabled()) {
            device.disable()
        } else {
            device.disable()
        }
    }

    override fun volumeUp() {
        device.volume += 1
    }

    override fun volumeDown() {
        device.volume -= 1
    }
}