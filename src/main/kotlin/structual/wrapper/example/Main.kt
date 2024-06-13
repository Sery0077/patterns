package structual.wrapper.example

import structual.wrapper.example.decorators.CompressionDecorator
import structual.wrapper.example.decorators.EncryptionDecorator

fun main() {
    val dataSource = StringDataSource()

    val decorator = EncryptionDecorator(CompressionDecorator(dataSource))

    decorator.writeData("Hello world")
}