class Rectangle(color: String, isTransparent: Boolean, var height: Int, var width: Int): Shape(color = "green", isTransparent = true) {
    override fun calculatePerimeter(): Double {
        val perimeter = 2 * (height + width).toDouble()
        println("The rectangle perimeter is ${perimeter}")
        return perimeter
    }
    override fun calculateArea(): Double {
        val area = height.toDouble() * width
        println("The rectangle area is ${area}")
        return area
    }
}