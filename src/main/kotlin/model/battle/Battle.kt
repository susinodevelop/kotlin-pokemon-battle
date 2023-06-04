package model.battle

import model.movement.functionality.AttackMovement
import model.movement.functionality.DefenseMovement
import model.movement.functionality.IMovement
import model.pokemon.IPokemon

class Battle(
    var pokemon1: IPokemon,
    var pokemon2: IPokemon
) {

    fun fight() {
        while (!anyChampion(pokemon1, pokemon2)) {
            println("---------------- TURNO DE ${pokemon1.name} ----------------")
            var movement = selectMovement(pokemon1.movements)
            this.executeMovement(movement, pokemon1, pokemon2)

            if (anyChampion(pokemon1, pokemon2)) break

            println("---------------- TURNO DE ${pokemon2.name} ----------------")
            movement = selectMovement(pokemon2.movements)
            this.executeMovement(movement, pokemon2, pokemon1)
        }

        if (pokemon1.isAlive()) println("${pokemon1.name} is the winner!!!")
        else println("${pokemon2.name} is the winner!!!")
    }

    fun selectMovement(movements: Map<String, IMovement>): IMovement {
        var selection = Math.round(Math.random()).toInt()
        return movements.values.elementAt(selection)
    }

    fun executeMovement(movement: IMovement, executor: IPokemon, victim: IPokemon) {
        when (movement) {
            is AttackMovement<*, *, *> -> {
                println("${executor.name} ha atacado con ${movement.name} a ${victim.name}")
                victim.damage(movement.use(victim).toInt())
            }

            is DefenseMovement -> println("${executor.name} se ha defendido con ${movement.name}")
            else -> println("${executor.name} ha usado ${movement.name}")
        }
    }

    fun anyChampion(pokemon1: IPokemon, pokemon2: IPokemon): Boolean {
        return !pokemon1.isAlive() || !pokemon2.isAlive()
    }
}