import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
) {

    val p = (a+b+c)

    init {
        println()
        println("Создан треугольник с со сторонами $a, $b, $c")
        println("area = ${getArea()}")
        println("p = ${getPerimeter()}")
        println()
    }



    fun getArea() = sqrt(((p/2)*(p/2)-a)*((p/2)-b)*((p/2)-c))
    fun getPerimeter() = a+b+c
}