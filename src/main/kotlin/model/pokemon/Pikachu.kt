package model.pokemon

import model.movement.Impactrueno
import model.movement.Latigo
import model.movement.Rayo
import model.movement.Trueno
import model.movement.functionality.IMovement
import model.type.IElectric
import model.type.ISteel
import kotlin.reflect.KClass

class Pikachu (
    override var name: String ="Pikachu",
    override var life: Int = 100,
    override var attack: Int = 10,
    override var defense: Int = 2,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int=0,
    override var specialDefense: Int=0,
    override var speed: Int=0,
    override var types: List<KClass<*>> = listOf(IElectric::class, ISteel::class),
):IPokemon{
    init {
        initializeMovements(Impactrueno(), Rayo(), Trueno(), Latigo())
    }
}