fun main(args: Array<String>) {
//    val fruits = mapOf<Int, String>(
//        1 to "Banana",
//        2 to "Apple",
//        3 to "Orange"
//    )
//
//    for (i in fruits) {
//        println(i.value)
//    }


//    val users = arrayListOf<String>("Ferdie", "Lisa", "Mary")
//    val age = arrayListOf<Int>(45,13,24)
//
//    for (count in 0..users.lastIndex) {
//        val userName = users[count]
//        val age = age[count]
//        println("$userName is $age years old")
//
//    }
//    var totalHumans = 0
//    var exitCode: Int = -1
//    println("How many people entered:")
//    var userInput = readLine()!!.toInt()
//     do {
//         println("How many people entered:")
//        totalHumans += userInput
//        println("Total of humans is $totalHumans")
//        println("How many people entered:")
//        userInput = readLine()!!.toInt()
//    } while (userInput != exitCode)
//    println("We got $totalHumans humans in here!")


    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    // foreach
    numbers.forEach{ number ->
        val newNumber = number*15
        println(newNumber)
    }

    // map - will return a new collection performing the transformation
    val newNumbers = numbers.map {
        it*2
    }
    println(newNumbers)

    // filter - returns a new collection filterting the values based on the
    // based on the condition
    val evenNumbers = numbers.filter {
        it % 2 == 0
    }
    println(evenNumbers)
    println()
    println()

//    numbers.forEach{
//        if (it % 3 == 0 && it % 5 == 0) {
//            println("PingPong")
//        } else if (it % 3 == 0) {
//            println("Ping")
//        } else if (it % 5 == 0) {
//            println("Pong")
//        } else (
//                println("x")
//        )
//
//    }
//    val grades = listOf(
//        listOf(94,82,85),
//        listOf(83,99,97),
//        listOf(76,89,90)
//
//    )
//    grades.forEach{ subject ->
//        var largest = 0
//        subject.forEach{ grade ->
//
//            if (grade > largest) largest = grade
//
//        }
//        println(largest)
//    }
    val numbers2 = (1..1000).toList()
    fun checker(number: Int): Boolean {
        var x = 0
        for(i in 1..number/2) {
            if (number % i == 0) {
                x += i
            }
        }
        return x == number
    }
//    numbers2.forEach{number ->
//        var x = 0
//        for(i in 1..number/2) {
//            if (number % i == 0) {
//                x += i
//            }
//        }
//        if (x == number) println(number)
//    }
    var p = numbers2.filter {
        checker(it)
    }
    println(p)

}