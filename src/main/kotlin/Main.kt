fun main (args: Array<String>) {

    val bulbasaur = Pokemon("Bulbasaur","Grass")
    println("New pokemon encountered: ${bulbasaur.name}")
    println("Pokemon type: ${bulbasaur.type}")


    val charmander = Pokemon("Charmander", "Fire")
    println("New pokemon encountered: ${charmander.name}")
    println("Pokemon type: ${charmander.type}")

    fun startBattle (pokemon1: Pokemon, pokemon2: Pokemon) {
        while (!pokemon1.hasFainted() || !pokemon2.hasFainted()) {
            pokemon1.tackle()
            pokemon2.healthPoints -= pokemon1.attackPoints
            println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
            if (pokemon2.hasFainted()) {
                println("${pokemon2.name} fainted. ${pokemon1.name} won!")
                break
            }
            pokemon2.tackle()
            pokemon1.healthPoints -= pokemon2.attackPoints
            println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
            if (pokemon1.hasFainted()) {
                println("${pokemon1.name} fainted. ${pokemon2.name} won!")
                break
            }
        }

    }
    startBattle(bulbasaur,charmander)
}