fun main() {
 addNumb(20,12)
 println( division(2,10))
}
//  Write a function that takes two integers as parameters and returns their sum.

fun addNumb(num1:Int, num2:Int): Int {
        var num = num1 + num2
    return num
}

//Create and Invoke a function given 2 numbers that returns the remainder of the division

fun division(num1: Int, num2:Int): Int{
    var division = num1 / num2
    return division
}
