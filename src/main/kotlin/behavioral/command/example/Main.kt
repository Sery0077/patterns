package behavioral.command.example

import behavioral.command.example.commands.InsertCommand
import behavioral.command.example.commands.Transaction

fun main() {
    val database = Database()
    val transaction = Transaction(database)

    transaction.addCommand(InsertCommand(data = "Mazda", database))
    transaction.addCommand(InsertCommand(data = "Mercedes", database))
    transaction.addCommand(InsertCommand(data = "BMW", database))
    transaction.execute()
}