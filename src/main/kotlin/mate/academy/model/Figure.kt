package mate.academy.model

abstract class Figure(val color: Color) {
    abstract fun printlnInfo()

    abstract fun getArea(): Double
}
