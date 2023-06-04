package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class Lanzallamas : AttackMovement<IGrass, IWater, IFire>(
    name = "Lanzallamas",
    damage = 50f,
    efectiveAgainst = IGrass::class,
    veryWeakAgainst = IWater::class,
    inmuneTo = IFire::class
) {
}