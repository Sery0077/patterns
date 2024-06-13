package behavioral.command.example

import java.io.Serializable

class Database {
    fun insert(data: Serializable) {
        println("Inserting data $data")
    }

    fun remove(query: Serializable) {
        println("Remove data by query $query")
    }
}