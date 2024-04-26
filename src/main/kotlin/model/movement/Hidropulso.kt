package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class Hidropulso : AttackMovement<IFire, IGrass, IWater>(
    name = "Hidropulso",
    damage = 100f,
    efectiveAgainst = IFire::class,
    veryWeakAgainst = IGrass::class,
    inmuneTo = IWater::class
) {
}