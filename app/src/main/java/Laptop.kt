class Laptop (model: String, memory: String, price: Int, screenSize: Double): Computer(model = "Macbook", memory = "256 GB", price = 9500) {
    val screenSize: Double = screenSize

    override fun presentationOfProduct() {
        println("This is a ${model} with ${memory}, a screensize of ${screenSize} and a price of ${price} DKK")
    }
}