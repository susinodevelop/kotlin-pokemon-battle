package model.pokemon

import model.movement.functionality.AttackMovement
import model.movement.functionality.IMovement
import model.type.IFire
import model.type.IType
import kotlin.reflect.KClass

interface IPokemon {
    var name: String
    var life: Int
    var attack: Int
    var defense: Int
    var specialAttack: Int
    var specialDefense: Int
    var speed: Int
    var types: List<KClass<*>>
    var movements: MutableMap<String, IMovement>
    fun isAlive(): Boolean {
        return life > 0
    }

    fun damage(damage: Int) {
        this.life = life - damage
    }

    fun initializeMovements(vararg movements: IMovement) {
        for (movement in movements) {
            addMovement(movement)
        }
    }

    fun addMovement(movement: IMovement) {
        movements.put(movement.name, movement)
    }
}