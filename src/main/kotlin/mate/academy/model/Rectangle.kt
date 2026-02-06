package mate.academy.model

class Rectangle(color: Color, val sideA: Double, val sideB: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, "
                    + "firstLeg: $sideA units, secondLeg: $sideB units, color: $color")
    }

    override fun getArea(): Double = sideA.times(sideB)
}
