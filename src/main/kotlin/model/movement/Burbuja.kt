package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class Burbuja : AttackMovement<IFire, IGrass, IWater>(
    name = "Burbuja",
    damage = 25f,
    efectiveAgainst = IFire::class,
    veryWeakAgainst = IGrass::class,
    inmuneTo = IWater::class
) {
}