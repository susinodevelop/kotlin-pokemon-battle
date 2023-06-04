package model.pokemon

import model.movement.Burbuja
import model.movement.Hidropulso
import model.movement.PistolaAgua
import model.movement.Reflejo
import model.movement.functionality.IMovement
import model.type.INormal
import model.type.IWater
import kotlin.reflect.KClass

class Blastoise (
    override var name: String = "Blastoise",
    override var life: Int = 200,
    override var attack: Int = 20,
    override var defense: Int = 4,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int=0,
    override var specialDefense: Int=0,
    override var speed: Int=0,
    override var types: List<KClass<*>> = listOf(IWater::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(Burbuja(), PistolaAgua(), Hidropulso(), Reflejo())
    }
}