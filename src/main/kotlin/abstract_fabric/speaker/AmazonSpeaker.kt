package abstract_fabric.speaker

class AmazonSpeaker: Speaker {
    override fun sayHello() {
        println("Hello, i'm Alexa!")
    }
}