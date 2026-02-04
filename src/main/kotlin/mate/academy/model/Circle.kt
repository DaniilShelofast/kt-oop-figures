package mate.academy.model

import kotlin.math.PI
import kotlin.math.pow

class Circle(color: Color, val radius: Double) : Figure(color) {

    override fun printlnInfo() {
        println("Figure: circle, area: ${getArea()} sq. units radius: $radius. color: $color")
    }

    override fun getArea(): Double = PI * radius.pow(2)
}