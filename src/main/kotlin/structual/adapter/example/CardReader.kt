package structual.adapter.example

class CardReader(private val memoryCard: MemoryCard): USB {

    override fun connect() {
        memoryCard.insert()
    }
}