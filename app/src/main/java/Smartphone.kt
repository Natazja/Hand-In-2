class Smartphone (model: String, memory: String, price: Int, color: String): Computer(model = "Iphone", memory = "125 GB", price = 6000) {
    val color: String = color

    override fun presentationOfProduct() {
        println("This is a ${color} ${model} with ${memory} and a price of ${price} DKK")
    }
}