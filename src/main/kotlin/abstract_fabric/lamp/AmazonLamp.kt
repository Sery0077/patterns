package abstract_fabric.lamp

class AmazonLamp: Lamp {
    override fun on() {
        println("Amazon lamp is on")
    }

    override fun off() {
        println("Amazon lamp is off")
    }
}