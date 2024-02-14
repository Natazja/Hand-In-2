class Triangle(color: String, isTransparent: Boolean, val baseA: Int, val heightA: Int, val sideB: Double, val sideC: Double ): Shape(color = "pink", isTransparent = false) {

    override fun calculatePerimeter(): Double {
        val perimeter = baseA + sideB + sideC
        println("The triangle perimeter is ${perimeter}")
        return perimeter
    }

    override fun calculateArea(): Double {
        val area = 0.5 * baseA * heightA
        println("The triangle area is ${area}")
        return area
    }
}