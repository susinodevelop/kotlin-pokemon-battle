package model.pokemon

import model.movement.Burbuja
import model.movement.Latigo
import model.movement.PistolaAgua
import model.movement.functionality.IMovement
import model.pokemon.type.IWaterPokemon
import model.type.INormal
import model.type.IType
import model.type.IWater
import kotlin.reflect.KClass

class Squirtle(
    override var name: String = "Squirtle",
    override var life: Int = 50,
    override var attack: Int = 5,
    override var defense: Int = 1,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int = 0,
    override var specialDefense: Int = 0,
    override var speed: Int = 0,
    override var types: List<KClass<*>> = listOf(IWater::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(Burbuja(), Latigo())
    }
}