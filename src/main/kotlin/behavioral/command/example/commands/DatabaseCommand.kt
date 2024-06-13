package behavioral.command.example.commands

import behavioral.command.example.Database

abstract class DatabaseCommand(protected val database: Database) {
    abstract fun execute()
}