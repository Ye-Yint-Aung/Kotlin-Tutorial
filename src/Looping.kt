class Looping {
    ///For Loop
    fun forLoopEgOne() {
        for (i in 1..5) {
            println("For Loop Number result is : ${i}")
        }
    }

    /// For Loop
    fun forLoopEgTwo() {
        for (i in 'A'..'E') {
            println("For Loop Character result is : ${i}")
        }
    }

    //While Loop
    fun whileLoopEgOne() {
        var number = 0
        while (number < 10) {
            println("While Loop number is $number")
            number++
        }
    }

    //Do While Loop
    fun doWhileLoopEgOne() {
        var number = 0
        do {
            println("Do While Loop number is : $number")
            number++
        } while (number < 10)
    }


}