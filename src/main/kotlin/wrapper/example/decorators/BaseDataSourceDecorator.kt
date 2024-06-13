package wrapper.example.decorators

import wrapper.example.DataSource

abstract class BaseDataSourceDecorator(protected val dataSource: DataSource) : DataSource {
    override fun writeData(data: String) {
        dataSource.writeData(data)
    }

    override fun readData(): String {
        return dataSource.readData()
    }
}