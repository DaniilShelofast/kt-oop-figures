package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.Rectangle
import kotlin.random.Random


class FigureSupplier {
    fun getRandomFigure(): Figure {
        when (Random.nextInt(1,5)) {
            1 -> Circle().printlnInfo()
            2 ->
        }

    }

    fun getDefaultFigure(): Figure = Circle(color = Color.WHITE, radius = 10.0)
}