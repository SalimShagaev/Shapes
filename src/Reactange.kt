class Reactange(
    val a: Int,
    val b: Int,
) {

    init {println("Создан прямоугольник со сторонами $a а также $b")}

    fun getPerimater() = 2*a+2*b

    fun getArea() = a*b

    fun isSquare() = a==b

}