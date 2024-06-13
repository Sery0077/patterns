package wrapper.example

import wrapper.example.decorators.CompressionDecorator
import wrapper.example.decorators.EncryptionDecorator

fun main() {
    val dataSource = StringDataSource()

    val decorator = EncryptionDecorator(CompressionDecorator(dataSource))

    decorator.writeData("Hello world")
}