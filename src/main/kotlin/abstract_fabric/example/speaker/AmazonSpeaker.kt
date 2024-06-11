package abstract_fabric.example.speaker

class AmazonSpeaker: Speaker {
    override fun sayHello() {
        println("Hello, i'm Alexa!")
    }
}