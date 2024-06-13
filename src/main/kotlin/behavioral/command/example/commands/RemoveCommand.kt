package behavioral.command.example.commands

import behavioral.command.example.Database
import java.io.Serializable

class RemoveCommand(private val query: Serializable, database: Database) : DatabaseCommand(database) {

    override fun execute() {
        database.remove(query)
    }
}