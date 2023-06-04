package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class Ascuas : AttackMovement<IGrass, IWater, IFire>(
    name = "Ascuas",
    damage = 25f,
    efectiveAgainst = IGrass::class,
    veryWeakAgainst = IWater::class,
    inmuneTo = IFire::class
) {
}