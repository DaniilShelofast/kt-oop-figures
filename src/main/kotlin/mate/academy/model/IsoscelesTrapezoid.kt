package mate.academy.model

const val TWO = 2

class IsoscelesTrapezoid(color: Color, val firstLeg: Double,
    val secondLeg: Double, val height: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: trapezoid, area: ${getArea()} sq. units, "
                    + "firstLeg: $firstLeg units, "
                    + "secondLeg: $secondLeg units, height: $height units, color: $color"
        )
    }

    override fun getArea(): Double = (firstLeg.plus(secondLeg)).times(height).div(TWO)

    override fun toString(): String {
        return "IsoscelesTrapezoid(firstLeg=$firstLeg, secondLeg=$secondLeg, height=$height)"
    }
}
