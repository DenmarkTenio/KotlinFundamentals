fun main(args: Array<String>) {
    val calculator = SumCalculator()
    var listOfNumbers = listOf<Int>(1,2,3,5,8,16,21)

    println(calculator.compute(1,2))
    println(calculator.compute(1.2,2.3))
    println(calculator.compute("6","2"))
    println(calculator.compute(listOfNumbers))


}






class SumCalculator {
    fun compute (first: Int, second: Int): Int {
        return first + second
    }
    fun compute (first: Double, second: Double): Double {
        return first + second
    }
    fun compute (first: String, second: String): Int {
        return first.toInt() + second.toInt()
    }
    fun compute (list: List<Int>): Int {
        return list.sum()
    }
}