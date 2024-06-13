package behavioral.command.example.commands

import behavioral.command.example.Database
import java.util.Stack

class Transaction(database: Database) : DatabaseCommand(database) {
    private val stack = Stack<DatabaseCommand>()

    fun addCommand(command: DatabaseCommand) {
        stack.push(command)
    }

    fun undoCommand(command: DatabaseCommand) {
        stack.pop()
    }

    override fun execute() {
        while (stack.isNotEmpty()) {
            val command = stack.pop()
            println("Executing $command")
            command.execute()
        }
    }
}