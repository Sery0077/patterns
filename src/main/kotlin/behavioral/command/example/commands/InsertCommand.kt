package behavioral.command.example.commands

import behavioral.command.example.Database
import java.io.Serializable

class InsertCommand(private val data: Serializable, database: Database) : DatabaseCommand(database) {
    override fun execute() {
        database.insert(data)
    }
}