package model.pokemon

import model.movement.Ascuas
import model.movement.Reflejo
import model.movement.functionality.IMovement
import model.pokemon.type.IFirePokemon
import model.type.IDragon
import model.type.IFire
import model.type.IType
import kotlin.reflect.KClass

class Charmander(
    override var name: String = "Charmander",
    override var life: Int = 50,
    override var attack: Int = 5,
    override var defense: Int = 1,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int = 0,
    override var specialDefense: Int = 0,
    override var speed: Int = 0,
    override var types: List<KClass<*>> = listOf(IFire::class, IDragon::class)
) : IPokemon {

    init {
        initializeMovements(Ascuas(), Reflejo())
    }
}