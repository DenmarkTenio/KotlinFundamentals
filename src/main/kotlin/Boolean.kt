fun main() {
    val isXmas = true
    val isNotXmas = false

    println(!isXmas && !isXmas)
    println(isXmas && isXmas)
    println(isXmas && !isXmas)

    println(!isXmas || !isXmas)
    println(isXmas || isXmas)
    println(isXmas || !isXmas)

    println(isXmas.and(false))

}