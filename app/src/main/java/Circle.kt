class Circle(color: String, isTransparent: Boolean, val radius: Int) : Shape(color = "blue", isTransparent = false) {
    val pi = 3.14

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * pi * radius
        println("The circle perimeter is ${perimeter}")
        return perimeter
    }
    override fun calculateArea(): Double {
        val area = pi * radius * radius
        println("The circle area is ${area}")
        return area
    }
}