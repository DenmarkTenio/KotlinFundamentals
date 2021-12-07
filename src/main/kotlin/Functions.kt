fun main(args: Array<String>) {
    fun isEven(num : Int): Boolean {
        return (num % 2 == 0)
    }
//    fun type(variable: Any): String {
//        when (variable) {
//            is String -> return "String"
//            is Byte -> return "Byte"
//            is Short -> return "Short"
//            is Int -> return "Int"
//            is Long -> return "Long"
//            is Float -> return "Float"
//            is Double -> return "Double"
//            else -> return "No idea"
//        }
//    }

    val account: MutableMap<String, Any> = mutableMapOf(
        "username" to "Brandon",
        "balance" to 0
    )

    fun checkBalance(account: Map<String,Any>): String {
        return "Your balance is P${account.getValue("balance")}"
    }

    fun deposit(account:MutableMap<String,Any>, amount: Int): Unit {
        if (amount > 5000) println("You can only deposit 5000 or below.")
        else if (amount % 100 != 0) println("You can only deposit an amount divisible by 100")
        else if (amount < 0) println("You cannot deposit a negative amount.")
        else {
            val newBalance = account.getValue("balance").toString().toInt() + amount
            account["balance"] = newBalance
            println("You just deposited $amount, your current balance is ${account["balance"]}.")
        }

    }

    fun withdraw(account:MutableMap<String,Any>, amount: Int): Unit {
        if (amount > account["balance"].toString().toInt()/2) println("You cannot withdraw more than half of your balance.")
        else if (amount < 0) println("You cannot withdraw a negative amount.")
        else {
            val newBalance = account.getValue("balance").toString().toInt() - amount
            account["balance"] = newBalance
            println("You just withdrew $amount, your current balance is ${account["balance"]}.")
        }
    }
    deposit(account,5000)
    deposit(account,-22)
    deposit(account, 125)
    withdraw(account,2506)
    withdraw(account,-11)
    withdraw(account,150)
}
