package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow

const val POW = 2

class Circle(color: Color, val radius: Double) : Figure(color) {
    override fun printlnInfo() {
        println("Figure: circle, area: ${getArea()} sq. units radius: $radius. color: $color")
    }

    override fun getArea(): Double = radius.pow(POW).times(PI)

    override fun toString(): String {
        return "Circle(radius=$radius)"
    }

}
