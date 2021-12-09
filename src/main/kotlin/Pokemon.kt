class Pokemon(val name: String, val type: String) {
    var healthPoints = 100
    var attackPoints = 10

    fun hasFainted(): Boolean {
        return healthPoints <= 0
    }


    // Methods
    fun tackle () {
        println("$name attacked with $attackPoints points.")
    }
}