package model.pokemon

import model.movement.Burbuja
import model.movement.PistolaAgua
import model.movement.Reflejo
import model.movement.functionality.IMovement
import model.type.INormal
import model.type.IWater
import kotlin.reflect.KClass

class Wartortle (
    override var name: String = "Wartortle",
    override var life: Int = 100,
    override var attack: Int = 10,
    override var defense: Int = 2,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int=0,
    override var specialDefense: Int=0,
    override var speed: Int=0,
    override var types: List<KClass<*>> = listOf(IWater::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(Burbuja(), PistolaAgua(), Reflejo())
    }
}