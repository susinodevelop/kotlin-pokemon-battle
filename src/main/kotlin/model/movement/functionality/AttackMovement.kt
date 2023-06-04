package model.movement.functionality

import model.pokemon.IPokemon
import model.type.IGrass
import model.type.IType
import kotlin.reflect.KClass

abstract class AttackMovement<E : IType, W : IType, I : IType>(
    override var name: String,
    var damage: Float,
    var efectiveAgainst: KClass<E>,
    var veryWeakAgainst: KClass<W>,
    var inmuneTo: KClass<I>
) : IMovement {

    fun use(pokeVictim:IPokemon): Float {
        for (type in pokeVictim.types ){
            when(type){
                inmuneTo -> {
                    println("${pokeVictim.name} es inmune a ${this.name}")
                    return 0f
                }
                efectiveAgainst-> {
                    println("Golpe crítico!!!")
                    println("${this.name} es muy eficaz contra ${pokeVictim.name}")
                    return (1.5 * damage).toFloat()
                }
                veryWeakAgainst-> {
                    println("No ha sido muy eficaz")
                    return (0.5 * damage).toFloat()
                }
            }
        }
        return damage
    }

}