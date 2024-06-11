package bridge.example

import bridge.example.device.TvDevice
import bridge.example.remote.RemoteController

fun main() {
    val remoteController = RemoteController(TvDevice())
    remoteController.togglePower()
    remoteController.volumeDown()
}