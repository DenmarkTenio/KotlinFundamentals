fun main (args: Array<String>) {
    var input = ""

    val bulbasaur = Pokemon("Bulbasaur",1)
    val charmander = Pokemon("Charmander", 2)

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
//    startBattle(bulbasaur,charmander)
    val squirtle = WaterTypePokemon("Squirtle", 3)
//    println("Pokemon Level: ${squirtle.level}")
//    println("Pokemon Attack: ${squirtle.attackPoints}")
//    println("Pokemon Health: ${squirtle.healthPoints}")
//
//    println(squirtle.tackle())
//    println(charmander.tackle())
//    val treecko = GrassTypePokemon("Treecko", 5)
//    println("Pokemon Level: ${treecko.level}")
//    println("Pokemon Attack: ${treecko.attackPoints}")
//    println("Pokemon Health: ${treecko.healthPoints}")
//
//    println(treecko.vineWhip())
//    println(treecko.tackle())
    val pickachu = ElectricTypePokemon("Pikachu", 1)
    val torchic = FireTypePokemon("Torchic", 1)


    fun pokemonSim (pokemon1: ElectricTypePokemon, pokemon2: FireTypePokemon) {
        while (!pokemon1.hasFainted() || !pokemon2.hasFainted()) {
            // FIRST TURN
            /*
            Display first pokemon's health and stamina and ask which move to use.
            If pokemon has insufficient stamina for chosen move, use TACKLE instead.
             */
            println("${pokemon1.name}'s turn!")
            println("Health: ${pokemon1.healthPoints}")
            println("Stamina: ${pokemon1.stamina}")
            println("Which move will you use?")
            println("TACKLE  THUNDERCAGE  THUNDERPUNCH  THUNDERBOLT")
            input = readLine()!!
            when (input.lowercase()) {
                "tackle" -> {
                    println("${pokemon1.name} used TACKLE!")
                    pokemon2.healthPoints -= pokemon1.tackle()
                    println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                }
                "thundercage" -> {
                    if (pokemon1.stamina < 1) {
                        println("Insufficient stamina.")
                        println("${pokemon1.name} used TACKLE instead!")
                        pokemon2.healthPoints -= pokemon1.tackle()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    } else {
                        println("${pokemon1.name} used THUNDERCAGE!")
                        pokemon2.healthPoints -= pokemon1.thunderCage()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    }
                }
                "thunderpunch" -> {
                    if (pokemon1.stamina < 2) {
                        println("Insufficient stamina.")
                        println("${pokemon1.name} used TACKLE instead!")
                        pokemon2.healthPoints -= pokemon1.tackle()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    } else {
                        println("${pokemon1.name} used THUNDERPUNCH!")
                        pokemon2.healthPoints -= pokemon1.thunderPunch()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    }
                }
                "thunderbolt" -> {
                    if (pokemon1.stamina < 1) {
                        println("Insufficient stamina.")
                        println("${pokemon1.name} used TACKLE instead!")
                        pokemon2.healthPoints -= pokemon1.tackle()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    } else {
                        println("${pokemon1.name} used THUNDERBOLT!")
                        pokemon2.healthPoints -= pokemon1.thunderBolt()
                        println("${pokemon2.name}'s health is now down to ${pokemon2.healthPoints}")
                    }
                }
                else -> {
                    println("${pokemon1.name} doesn't know that move!")
                    println("${pokemon1.name} just looked at its trainer with confusion.")
                }
            }
            // Check if enemy has fainted after the attack.
            if (pokemon2.hasFainted()) {
                println("${pokemon2.name} fainted. ${pokemon1.name} won!")
                break
            }
            // SECOND TURN
            /*
            Display second pokemon's health and stamina and ask which move to use.
            If pokemon has insufficient stamina for chosen move, use TACKLE instead.
             */
            println("${pokemon2.name}'s turn!")
            println("Health: ${pokemon2.healthPoints}")
            println("Stamina: ${pokemon2.stamina}")
            println("Which move will you use?")
            println("TACKLE  EMBER  FIREBLAST  FLAMETHROWER")
            input = readLine()!!
            when (input.lowercase()) {
                "tackle" -> {
                    println("${pokemon2.name} used TACKLE!")
                    pokemon1.healthPoints -= pokemon2.tackle()
                    println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                }
                "ember" -> {
                    if (pokemon2.stamina < 1) {
                        println("Insufficient stamina.")
                        println("${pokemon2.name} used TACKLE instead!")
                        pokemon1.healthPoints -= pokemon2.tackle()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    } else {
                        println("${pokemon2.name} used EMBER!")
                        pokemon1.healthPoints -= pokemon2.ember()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    }
                }
                "fireblast" -> {
                    if (pokemon2.stamina < 2) {
                        println("Insufficient stamina.")
                        println("${pokemon2.name} used TACKLE instead!")
                        pokemon1.healthPoints -= pokemon2.tackle()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    } else {
                        println("${pokemon2.name} used FIREBLAST!")
                        pokemon1.healthPoints -= pokemon2.fireBlast()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    }
                }
                "flamethrower" -> {
                    if (pokemon2.stamina < 3) {
                        println("Insufficient stamina.")
                        println("${pokemon2.name} used TACKLE instead!")
                        pokemon1.healthPoints -= pokemon2.tackle()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    } else {
                        println("${pokemon2.name} used FLAMETHROWER!")
                        pokemon1.healthPoints -= pokemon2.flameThrower()
                        println("${pokemon1.name}'s health is now down to ${pokemon1.healthPoints}")
                    }
                }
                else -> {
                    println("${pokemon2.name} doesn't know that move!")
                    println("${pokemon2.name} just looked at its trainer with confusion.")
                }
            }
            // Check if enemy has fainted after the attack.
            if (pokemon1.hasFainted()) {
                println("${pokemon1.name} fainted. ${pokemon2.name} won!")
                break
            }

        }
    }
    pokemonSim(pickachu,torchic)

}