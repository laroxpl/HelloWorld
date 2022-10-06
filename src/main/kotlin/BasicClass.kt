fun basicClass() {
    class Rectangle(var height: Double, var length: Double) {
        var perimeter = (height + length) * 2 // objekt
        var nonPerimeter = (height - length) / 2 // objekt
    }

    val rectangle = Rectangle(5.0, 6.0) //trza zrobic nowa zmienna ktora uzywa klasy() i wpisujesz jej tam dane
    println(rectangle.nonPerimeter)
}