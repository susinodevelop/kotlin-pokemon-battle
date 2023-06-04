package model.pokemon

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
    var movements: Map<String, IMovement>

    fun isAlive(): Boolean {
        return life > 0
    }

    fun damage(damage: Int) {
        this.life = life - damage
    }
}