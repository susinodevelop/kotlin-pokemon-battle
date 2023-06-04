package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class PistolaAgua : AttackMovement<IFire, IGrass, IWater>(
    name = "Pistola Agua",
    damage = 50f,
    efectiveAgainst = IFire::class,
    veryWeakAgainst = IGrass::class,
    inmuneTo = IWater::class
) {
}