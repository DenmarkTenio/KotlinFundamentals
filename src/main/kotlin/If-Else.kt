fun main(args: Array<String>) {
    println("What's your name?")
    var name = readLine()!!
    println("How old are you?")
    var age = readLine()!!.toInt()
    if (age >= 0) {
        if (age == 17) {
            println("You need a guardian angel.")
        } else if (age >= 18){
            println("Aight, you are allowed inside.")
        } else {
            println("Imma keep it real with you $name, you are not allowed.")
        }
    } else {
        println("You ain't even born yet!")
    }


}