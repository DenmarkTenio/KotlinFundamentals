fun main(args: Array<String>) {
//    println("What day is today?")
//    val dayOfWeek = readLine()!!.lowercase()



//    when (dayOfWeek) {
//        "monday" -> println("Hey it's Monday! Let's be productive!")
//        "tuesday" -> println("Hey it's Tuedsday! Choose to be happy!")
//        "wednesday" -> println("It is Wednesday my dudes! AAAAAAAAAAAHHHH!")
//        "thursday" -> println("Hey it's Thursday! We're almost there!")
//        "friday" -> println("TGIS!")
//        "saturday" -> println("Eto na nagkamali na, tumalong na mga kaibigan!")
//        "sunday" -> println("Eto na nagkamali na, tumalong na mga kaibigan!")
//        else -> println("Pinagsasabe mo?")
//    }
    println("Type the first number")
    var num1 = readLine()!!.toDouble()
    println("Type the operator")
    var operator = readLine()!!
    println("Type the second number")
    var num2 = readLine()!!.toDouble()

    when (operator) {
        "+" -> println("The sum is ${(num1 + num2).toBigDecimal().setScale(2)}")
        "-" -> println("The difference is ${(num1 - num2).toBigDecimal().setScale(2)}")
        "*" -> println("The product is ${(num1 * num2).toBigDecimal().setScale(2)}")
        "/" -> println("The quotient is ${(num1 / num2).toBigDecimal().setScale(2)}")
        "%" -> println("The remainder is ${(num1 % num2).toBigDecimal().setScale(2)}")
        else -> println("Huh? Okay ka lang?")
    }
}