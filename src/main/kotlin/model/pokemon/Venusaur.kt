package model.pokemon

import model.movement.DanzaPetalo
import model.movement.HojaAfilada
import model.movement.Latigo
import model.movement.LatigoCepa
import model.movement.functionality.IMovement
import model.type.IGrass
import model.type.INormal
import kotlin.reflect.KClass

class Venusaur(
    override var name: String = "Venusaur",
    override var life: Int = 200,
    override var attack: Int = 20,
    override var defense: Int = 4,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int = 0,
    override var specialDefense: Int = 0,
    override var speed: Int = 0,
    override var types: List<KClass<*>> = listOf(IGrass::class, INormal::class)
) : IPokemon {
    init {
        initializeMovements(LatigoCepa(), HojaAfilada(), DanzaPetalo(), Latigo())
    }

}