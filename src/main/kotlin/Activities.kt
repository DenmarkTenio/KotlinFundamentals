import java.util.regex.Pattern

fun main(args: Array<String>) {
//    1
    println("Enter first number")
    var num1 = readLine()!!.toDouble()
    println("Enter second number")
    var num2 = readLine()!!.toDouble()
    println("Enter third number")
    var num3 = readLine()!!.toDouble()
    val array = arrayOf<Double>(num1,num2,num3)
    var largest: Double = Double.MIN_VALUE
    for (i in 0..array.lastIndex) {
        if (array[i] > largest) {largest = array[i]}
    }
    println("$largest is the largest number.")
    println("")
    println("")
//
////    2
    println("Enter the letter")
    var letter = readLine()!!
    when (letter.lowercase()) {
        "a" -> println("$letter is a vowel.")
        "e" -> println("$letter is a vowel.")
        "i" -> println("$letter is a vowel.")
        "o" -> println("$letter is a vowel.")
        "u" -> println("$letter is a vowel.")
        else -> println("$letter is a consonant.")
    }
    println("")
    println("")

//    3

    println("Enter password:")
    val password = readLine()!!
    val numeric = password.filter { it.isDigit() }
    val (low, up) = password.partition { it.isLowerCase() }
    val hasSpecChar = password.all { it.isLetterOrDigit() }

    if (password.length in 6..16){
        if (low.isNotEmpty() && up.isNotEmpty()) {
            if (numeric.isNotEmpty()) {
                if (!hasSpecChar) {
                    println("Password saved.")
                } else {
                    println("Password must contain at least 1 special character.")
                }
            } else {
                println("Password must contain at least 1 numeric character.")
            }
        } else {
            println("Password must contain at least 1 uppercase and 1 lowercase letter.")
        }
    } else {
        println("Password must be minimum of 6 characters and maximum of 16 characters.")
    }
}