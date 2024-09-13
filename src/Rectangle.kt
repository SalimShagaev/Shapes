class Rectangle(
    val a: Int,
    val b: Int,
) {

    init {
        println()
        println("Создан прямоугольник со сторонами $a а также $b")
        println("Периметр прямоугольника равен ${getPer()}")
        println("Площадь равна ${getArea()} является квадратом? ${isSquare()}")
        println()
    }

    fun getPer() = 2*a+2*b

    fun getArea() = a*b

    fun isSquare() = a==b

}