class Circle(
    val radius: Double,
) {

    val pi = 3.1415

    init{
        println("Создан круг с радиусом $radius")
        println("area ${getArea()}")
        println("per = ${getPerimeter()}")
        println()
    }

    fun getArea() = radius*radius* pi

    fun getPerimeter() = 2*radius*pi

}