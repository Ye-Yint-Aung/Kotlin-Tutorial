fun main() {

    showName()  /// Function Example

    /// Separated Class Example
    var stu = ClassEg()
    stu.name = "MG MG"
    println(stu.getStudent())

    /// Constructor Example
    var carName = "Kia"
    var car = ConstructorEg(carName);
    car.showCarName()

    /// When Expression
    var whenElseExpersion = WhenElseExpersion()
    whenElseExpersion.Calculate()

    /// Looping
    var looping = Looping()
    // For Loop
    looping.forLoopEgOne()
    looping.forLoopEgTwo()
    // While Loop
    looping.whileLoopEgOne()
    // Do While Loop[
    looping.doWhileLoopEgOne()

}

fun showName() {
    println("I am a Function.")
}

