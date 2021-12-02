fun main () {
    val myMessage = "Happy birthday! Justin!"
    val anotherMessage = "Happy birthday! Justin!"

//   extract Justin
    println(myMessage.subSequence(16,22))
//   extract Justin
    println(myMessage.substring(16,22))
//    check if 2 strings are the same
    println(myMessage.compareTo(anotherMessage))
//  Erase the first 16 characters
    println(myMessage.drop(16))
//  check if "Justin" exists in the string
    println(myMessage.contains("Justin"))


    val givenName = "Denmark"
    val surName = "Tenio"
    val middleName = "Gonzales"

    println("My full name is $givenName ${middleName.first()} $surName.")

    val myAge = 19
    println("My age 10 years from now is ${myAge + 10}.")


    val nickname = "glenn"
    val productQuantity = 100
    val productPrice = 10
//    val amount = productPrice * productQuantity


    println("${nickname.replaceFirstChar { it.uppercase() }}, the total price of your purchase is P${productPrice * productQuantity}.")
}