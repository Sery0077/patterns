package wrapper.example.decorators

import wrapper.example.DataSource
import java.util.Base64

class EncryptionDecorator(dataSource: DataSource) : BaseDataSourceDecorator(dataSource) {

    override fun writeData(data: String) {
        super.writeData(encrypt(data))
    }

    override fun readData(): String {
        return decode(super.readData())
    }

    private fun encrypt(data: String): String {
        val result: ByteArray = data.toByteArray()
        return Base64.getEncoder().encodeToString(result)
    }

    private fun decode(data: String): String {
        val result = Base64.getDecoder().decode(data)
        return String(result)
    }
}