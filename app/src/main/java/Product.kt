open class Product(name: String, price: Double, quantity: Number) {
    val name: String = name
    val price: Double = price
    var quantity: Number = quantity

    open fun identifyProductCategory() {
        println("This is a product.")
    }
}