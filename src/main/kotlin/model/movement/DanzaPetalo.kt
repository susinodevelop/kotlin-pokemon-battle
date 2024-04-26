package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class DanzaPetalo : AttackMovement<IWater, IFire, IGrass>(
    name = "Danza Pétalo",
    damage = 100f,
    efectiveAgainst = IWater::class,
    veryWeakAgainst = IFire::class,
    inmuneTo = IGrass::class
) {
}