package structual.bridge.example

import structual.bridge.example.device.TvDevice
import structual.bridge.example.remote.RemoteController

fun main() {
    val remoteController = RemoteController(TvDevice())
    remoteController.togglePower()
    remoteController.volumeDown()
}