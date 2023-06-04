package model.pokemon

import model.movement.Ascuas
import model.movement.Lanzallamas
import model.movement.Reflejo
import model.movement.functionality.IMovement
import model.type.IDragon
import model.type.IFire
import model.type.INormal
import model.type.IWater
import kotlin.reflect.KClass

class Charmeleon (
    override var name: String = "Charmeleon",
    override var life: Int = 100,
    override var attack: Int = 10,
    override var defense: Int = 2,
    override var movements: MutableMap<String, IMovement> = mutableMapOf(),
    override var specialAttack: Int=0,
    override var specialDefense: Int=0,
    override var speed: Int=0,
    override var types: List<KClass<*>> = listOf(IFire::class, IDragon::class)
) : IPokemon {
    init {
        initializeMovements(Ascuas(), Lanzallamas(), Reflejo())
    }
}