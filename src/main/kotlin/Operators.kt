fun main() {
    val numByte = Byte.MAX_VALUE
    var numShort = 1
    val numLong = 2
    val numFloat = Float.MAX_VALUE
    val numDouble = Double.MAX_VALUE

    var result = numLong + numShort
    println(result)

    result = numLong - numShort
    println(result)

    result = numLong * numShort
    println(result)

    result = numLong / numShort
    println(result)

    result = numLong % numShort
    println(result)

    println(numShort++)

    println(numShort)

    println(++numShort)

    var addition = 2
    addition += addition
    println(addition)

    var subtraction = 2
    subtraction -= subtraction
    println(subtraction)

    var multiplication = 2
    multiplication *= multiplication
    println(multiplication)

    var division = 2
    division /= division
    println(division)
}