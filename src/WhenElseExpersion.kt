class WhenElseExpersion {

    var x = 102

    fun Calculate(){
        when(x){
            100 -> println("Value is 100")
            101 -> println("Value is 101")
            102 -> println("Value is 102")
            103 -> println("Value is 103")
            in 100..120 -> println("Value is in range of 100 to 120")
            else -> println("Value is Other")
        }
    }
}