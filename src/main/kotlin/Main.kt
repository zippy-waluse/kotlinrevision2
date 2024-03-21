import kotlin.io.path.createTempDirectory

fun main() {
   println(takeNum(3,5))
    println(changeWord("My name is Waluse"))
    println(repWod("hi i am nur wautu"))
    println(isEven(3))
    println(extract("devineee"))
    declare(53.44)
    println(printWord("akirachix"))
   println(nameAge("Waluse", 12))
    printInterest("I eat")

    var a = 22
    println("a = ${++a}")

    takeWords("mary","Hur","Mia","Mue")



}
//Write a function that takes two integers as parameters and returns their sum.
fun takeNum(num1:Int,num2:Int): Int{
    return num1 + num2

}

fun changeWord(word:String): String{
 return word.replace("Waluse","Warga")
  }


//Write a Kotlin function that changes the value of Kibaki to ruto in this sentence
//“Kibaki was the second president of Kenya”

fun repWod(name:String): String{
    return name.replace("nur","Wati")
}



//Write a Kotlin function named isEven that takes an integer as a parameter and returns a Boolean indicating whether the number is even or odd. (4 points)
fun isEven(num:Int): Boolean{
    var number = num % 2
    if (number==0)
return true
    else
        return false
}


//Create a Kotlin function that extracts a substring from a given string starting from index 2 to index 5 using the slice function and returns it. (6 points)
fun extract(name:String):String{
    return name.slice(2..5)
    println(printWord("akirachix"))
}


//Implement a Kotlin program that declares a variable temperature of type Double and assigns it a temperature value. Then, print a message saying "The temperature is [temperature] degrees Celsius."
fun declare(temp:Double){
    println("The temp is $temp degreed celcius")
}

//
//Given a string "akirachix". Write a function that prints out a string composed of the first, third and fourth characters of the string (2 points)
fun printWord(word: String){
   println(word[0])
    println(word[2])
    println(word[3])

}


//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
//Create variables and assign them some values for each of these fields


//Write a function that takes in 2 parameters, name and age and returns a String with this structure "Hi, my name is x and I am y years old." Where x and y are the provided name and age respectively.
fun nameAge(name: String,age:Int ): String{
    return "Hi my name is $name and I am $age years old"
}

//How old will I be next year if i’m currently 22 (solve using Kotlin functions and operators)




//Create and invoke a function that prints out an interesting fact about yourself
fun printInterest(name: String){
    println(name)
}

fun takeWords(name1:String,name2:String,name3:String, name4:String){
    var nameArray = arrayOf(name1,name2,name3,name4)
    println(nameArray.contentToString())
}

fun africancities(cities:Array<String>){
    cities.forEach { city->
        println(city.capitalize())
    }
}










