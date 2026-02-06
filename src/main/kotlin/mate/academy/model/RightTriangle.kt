package mate.academy.model

const val DIV = 2

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: triangle, area: ${getArea()} sq. units, "
                    + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }

    override fun getArea(): Double = (firstLeg.times(secondLeg)).div(DIV)

    override fun toString(): String {
        return "RightTriangle(firstLeg=$firstLeg, secondLeg=$secondLeg)"
    }

}
