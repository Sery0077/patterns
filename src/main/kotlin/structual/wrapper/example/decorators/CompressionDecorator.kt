package structual.wrapper.example.decorators

import structual.wrapper.example.DataSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.util.Base64
import java.util.zip.Deflater
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterInputStream

class CompressionDecorator(dataSource: DataSource) : BaseDataSourceDecorator(dataSource) {

    private var compressLevel: Int = 1

    fun setCompressLevel(level: Int) {
        compressLevel = level
    }

    override fun writeData(data: String) {
        super.writeData(compress(data))
    }

    override fun readData(): String {
        return decompress(super.readData())
    }

    private fun compress(data: String): String {
        val bytes = data.toByteArray()

        val bout = ByteArrayOutputStream(512)
        val dos = DeflaterOutputStream(bout, Deflater(compressLevel))
        dos.write(bytes)
        dos.close()
        bout.close()

        return Base64.getEncoder().encodeToString(bout.toByteArray())
    }

    private fun decompress(data: String): String {
        val bytes = data.toByteArray()

        val input: InputStream = ByteArrayInputStream(bytes)
        val iin = InflaterInputStream(input)
        val bout = ByteArrayOutputStream(512)
        var b: Int

        while (iin.read().also { b = it } != -1) {
            bout.write(b)
        }
        input.close()
        iin.close()
        bout.close()

        return String(bout.toByteArray())
    }
}