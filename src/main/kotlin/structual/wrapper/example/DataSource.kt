package structual.wrapper.example

interface DataSource {
    fun writeData(data: String)
    fun readData(): String
}