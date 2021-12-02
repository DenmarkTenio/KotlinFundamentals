import java.time.LocalDate
import java.time.Period

fun main() {
//    Simple
    println("What is your name?")
    val yourName = readLine()
    println("What year were you born?")
    val year = readLine()!!.toInt()
    println("What month were you born?")
    val month = readLine()!!.toInt()
    println("What day were you born?")
    val day = readLine()!!.toInt()
    val bDay = LocalDate.of(year,month,day)
    val age = bDay.until(LocalDate.now())
    println("Hello $yourName! You are ${Period.between(bDay,LocalDate.now()).years} years old.")
//    Complex
    println("Hello $yourName! You are ${age.years} years, ${age.months} months, and ${age.days} days old.")

}