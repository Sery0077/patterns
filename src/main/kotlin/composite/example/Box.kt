package composite.example

import composite.example.product.Product

class Box(private val content: MutableList<Product> = arrayListOf()) : Product {

    fun add(element: Product) {
        content.add(element)
    }

    fun remove(element: Product) {
        content.remove(element)
    }

    override fun getCost(): Int {
        return content.fold(0) { acc, product ->
            acc + product.getCost()
        }
    }
}