class Book (name: String, price: Double, quantity: Number, pages: Int) : Product(name = "Harry Potter and the Deathly Hallows", price = 399.95, quantity = 1) {
    override fun identifyProductCategory() {
        println("This is a book.")
    }
}