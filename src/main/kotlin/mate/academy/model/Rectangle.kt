package mate.academy.model

class Rectangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: rectangle, area: ${getArea()} sq. units, "
                    + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }

    override fun getArea(): Double = firstLeg.times(secondLeg)

    override fun toString(): String {
        return "Rectangle(firstLeg=$firstLeg, secondLeg=$secondLeg)"
    }
}
