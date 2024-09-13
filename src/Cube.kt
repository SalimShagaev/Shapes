class Cube(
    val a: Int,
) {

    init {
        println()
        println("Создан куб с размером боковой грани $a")
        println("Площадь поверхности фигуры ${getArea()}")
        println("Объем куба равен ${getVolume()}")
        println()
    }

    fun getArea() = 6*(a*a)
    fun getVolume() = a*a*a


}