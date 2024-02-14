open class Computer(model: String, memory: String, price: Int) {
    var model: String = model
    var memory: String = memory
    val price: Int = price

    open fun presentationOfProduct() {
        println("presentation!")
    }
}