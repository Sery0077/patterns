package wrapper.example

class StringDataSource() : DataSource {

    private var data: String = ""

    override fun writeData(data: String) {
        this.data = data
        println("Wrote data $data")
    }

    override fun readData(): String {
        return data
    }
}