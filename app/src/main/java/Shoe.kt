class Shoe(name: String, price: Double, quantity: Number, shoeSize: Int) : Product(name = "Nike Pegasus", price = 899.95, quantity = 2) {
    override fun identifyProductCategory() {
        println("This is a shoe.")
    }
}