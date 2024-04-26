package model.pokemon

import model.movement.Latigo
import model.movement.LatigoCepa
import model.movement.functionality.IMovement
import model.pokemon.type.IGrassPokemon
import model.type.IGrass
import model.type.INormal
import model.type.IType
import kotlin.reflect.KClass

class Bulbasaur(
    override var name: String = "Bulbasaur",
    override var life: Int = 50,
    override var attack: Int = 5,
    override var defense: Int = 1,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int = 0,
    override var specialDefense: Int = 0,
    override var speed: Int = 0,
    override var types: List<KClass<*>> = listOf(IGrass::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(LatigoCepa(), Latigo())
    }
}