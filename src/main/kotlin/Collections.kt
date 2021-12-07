fun main() {
    // Collections are groups of related data.
    // Immutable - can't be changed
    // Mutable - can be changed
    // List, Set, Map

    // List - ordered collections that can be accessed by indeces

    // immutable
    val airlines = listOf<String>("Cebu Pacific", "PAL", "AirAsia")
    println(airlines)
    println(airlines[1])

    // mutable
    val terminals = mutableListOf<Int>(1,2,3,4)
    println(terminals)
    terminals.add(5)
    println(terminals)
    println(airlines.contains("PAL"))
    println()
    println()

    val animals = listOf<String>("Dog", "Hedgehog", "Snake") // declares an immutable list of String named "animals"
    println(animals) // prints the said list
    println(animals[2]) // prints the data on the list with the index of 2
    println(animals.count()) // prints how many data is in the list
    println(animals.get(0)) // retrieves and prints the data in the list by its index

    val fromSoftware = mutableListOf<String>("DS1", "DS2", "DS3") // declares a mutable
    // list of String named "fromSoftware"
    println(fromSoftware) // prints the list
    println(fromSoftware.contains("Bloodborne")) // checks if the list contains "Bloodborne"
    fromSoftware.add("Bloodborne") // adds another data to the end of the list
    println(fromSoftware) // prints the list again
    println()
    println()

    // Set - contains unique set of elements (no duplicates)
    val usernames: Set<String> = setOf("Brandon", "Amelia", "Charlie")
//    println(usernames)
//    println(usernames.size)

    val students : MutableSet<String> = mutableSetOf("Brandon", "Amelia", "Charlie")
    println(students)
    students.add("Alex")
    println(students)
    students.add("Brandon")
    println(students)

    val numbers : Set<Int> = setOf(1,2,3,4,5,6,7,8,9,10)
    println(numbers.isEmpty()) // checks if empty
    println(numbers.sum()) // prints the sum of data inside the set
    println(numbers.average()) // prints the average of data inside the set
    println(numbers.filter { it % 2 == 0 }) // returns only the even numbers
    println(numbers.random()) // return a random element from the collection
    println(numbers.shuffled()) // shuffles the collection

    // MAP - key-value pairs
//    val studentDetails: Map<String, String> = mapOf(
//        "firstName" to "Brandon",
//        "lastName" to "Diaz",
//        "yrLevel" to "first",
//        "section" to "A"
//    )
//    println(studentDetails.keys)
//    println(studentDetails.values)

//    val studentDetails: MutableMap<String,String> = mutableMapOf(
//        "firstName" to "Brandon",
//        "lastName" to "Diaz",
//        "yrLevel" to "first",
//        "section" to "A"
//    )
//
//    println(studentDetails)
//    studentDetails.remove("section")
//    println(studentDetails)

    val ulfricStormcloak = mapOf(
        "high" to "maybe",
        "king" to false,
        "highKing" to false,
        "rebelScum" to true
    )
    println(ulfricStormcloak)
    println(ulfricStormcloak.values) // returns values
    println(ulfricStormcloak.keys) // returns keys
    println(ulfricStormcloak.get("king")) // returns value of key
    println(ulfricStormcloak.containsKey("thalmor")) // returns if key exists

    val dragonBorn = mutableMapOf(
        "dovahkiin" to true,
        "isAwesome" to true,
        "gold" to 33845,
        "isMarried" to false,
        "hasChildren" to false
    )
    println(dragonBorn.isEmpty()) // checks if map is empty
    println(dragonBorn.get("gold")) // retrieves the value of gold key
    println(dragonBorn.containsKey("usesSkooma")) // checks if map has key
    println(dragonBorn.containsValue(53)) // check if map has value
    println(dragonBorn.remove("isMarried")) // removes a key-value by key
}