open class Pokemon(val name: String, var level: Int) {
    var healthPoints = 100
    var attackPoints = 10


    fun hasFainted(): Boolean {
        return healthPoints <= 0
    }


    // Methods
    open fun tackle (): Int {
//        println("$name used Tackle!")
        return attackPoints/2
    }

    // init runs before anything else
    init {
        this.healthPoints *= this.level
        this.attackPoints *= this.level
    }
}

// Inheritance
// We can set up
class WaterTypePokemon (name: String, level: Int): Pokemon(name, level) {
    fun hydroPump (): Int {
        return attackPoints / 2
    }
    override fun tackle (): Int {
//        println("$name used Tackle!")
        return attackPoints + 10
    }
}
class GrassTypePokemon (name: String, level: Int): Pokemon(name, level) {
    fun vineWhip (): Int {
//        println("$name used Vine Whip!!")
        return attackPoints + 5
    }
    override fun tackle (): Int {
//        println("$name used Tackle!")
        return attackPoints + 20
    }
}

class FireTypePokemon (name: String, level: Int): Pokemon(name,level) {
    var stamina = 3
    override fun tackle (): Int {
        this.stamina += 1
        return attackPoints/2
    }
    fun ember(): Int {
        this.stamina -= 1
        return attackPoints + 2
    }
    fun fireBlast(): Int {
        this.stamina -= 2
        return attackPoints + 3
    }
    fun flameThrower(): Int {
        this.stamina -= 3
        return attackPoints + 4
    }
}

class ElectricTypePokemon (name: String, level: Int): Pokemon(name,level) {
    var stamina = 3
    override fun tackle (): Int {
        this.stamina += 1
        return attackPoints/2
    }
    fun thunderCage(): Int {
        this.stamina -= 1
        return attackPoints + 3
    }
    fun thunderPunch(): Int {
        this.stamina -= 2
        return attackPoints + 4
    }
    fun thunderBolt(): Int {
        this.stamina -= 3
        return attackPoints + 5
    }
}