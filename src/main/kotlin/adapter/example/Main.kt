package adapter.example

fun main() {
    val usbConnection: USB = CardReader(MemoryCard())
    usbConnection.connect()
}