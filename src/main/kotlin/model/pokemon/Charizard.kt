package model.pokemon

import model.movement.Ascuas
import model.movement.Lanzallamas
import model.movement.Llamarada
import model.movement.Reflejo
import model.movement.functionality.IMovement
import model.type.IDragon
import model.type.IFire
import kotlin.reflect.KClass

class Charizard (
    override var name: String = "Charizard",
    override var life: Int = 200,
    override var attack: Int = 20,
    override var defense: Int = 4,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int=0,
    override var specialDefense: Int=0,
    override var speed: Int=0,
    override var types: List<KClass<*>> = listOf(IFire::class, IDragon::class)
) : IPokemon {
    init {
        initializeMovements(Ascuas(), Lanzallamas(), Llamarada(), Reflejo())
    }
}