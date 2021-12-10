import java.lang.IllegalArgumentException

interface PokemonInterface {
    val healthPoints: Double
    var attackPoints: Double
    val defensePoints: Double

    //this
    fun tackle (enemy: Pokemon): Double
    fun tackle (enemyDefensePoints: Double): Double
    fun hasFainted (): Boolean
}






open class Pokemon(val name: String, var level: Int = 1, nickName: String = ""): PokemonInterface {
    override var healthPoints: Double = 100.0
    override var attackPoints: Double = 10.0
    override val defensePoints: Double = 1.0

    var nickName = nickName
        set(value) {
            if (value.length >= 3) field = value
            else {
                throw IllegalArgumentException("Nickname must be at least 3 characters long.")
            }
        }
        get() = "Hi! I'm $field!"
    init {
        println("New pokemon encountered: $name")
    }

    override fun hasFainted(): Boolean {
        return healthPoints <= 0
    }



    // Methods
    private fun computeDamage(enemyDefensePoints: Double): Double {
        return attackPoints - enemyDefensePoints
    }
    override fun tackle (enemy: Pokemon): Double {
        val damage = computeDamage(enemy.defensePoints)
        return damage
    }
    override fun tackle (enemyDefensePoints: Double): Double {
        val damage = computeDamage(enemyDefensePoints)
        return damage
    }
}


// INHERITANCE
class WaterTypePokemon(name: String, level: Int, nickName: String): Pokemon(name, level, nickName) {
    init {
        println("Pokemon Type: Water")
    }
    fun hydroPump(): Double {
        return attackPoints / 2
    }

    override fun tackle(enemy: Pokemon): Double {
        return attackPoints + 10
    }
}


class GrassTypePokemon(name: String, level: Int, nickName: String): Pokemon(name, level, nickName) {
    init {
        println("Pokemon Type: Grass")
    }

    fun vineWhip(): Double {
        return attackPoints + 5
    }

    override fun tackle(enemy: Pokemon): Double {
        return attackPoints + 20
    }
}