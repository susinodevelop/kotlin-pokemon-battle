package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class Llamarada : AttackMovement<IGrass, IWater, IFire>(
    name = "Llamarada",
    damage = 100f,
    efectiveAgainst = IGrass::class,
    veryWeakAgainst = IWater::class,
    inmuneTo = IFire::class
) {
}