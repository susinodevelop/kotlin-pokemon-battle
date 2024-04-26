package model.pokemon

import model.movement.HojaAfilada
import model.movement.Latigo
import model.movement.LatigoCepa
import model.movement.functionality.IMovement
import model.type.IGrass
import model.type.INormal
import kotlin.reflect.KClass

class Ivisaur(
    override var name: String = "Ivisaur",
    override var life: Int = 100,
    override var attack: Int = 10,
    override var defense: Int = 2,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int = 0,
    override var specialDefense: Int = 0,
    override var speed: Int = 0,
    override var types: List<KClass<*>> = listOf(IGrass::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(LatigoCepa(), HojaAfilada(), Latigo())
    }
}