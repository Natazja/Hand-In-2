class Tshirt (name: String, price: Double, quantity: Number, tooBig: Boolean) : Product(name = "Weekday", price = 189.95, quantity = 1) {
    override fun identifyProductCategory() {
        println("This is a T-shirt.")
    }
}