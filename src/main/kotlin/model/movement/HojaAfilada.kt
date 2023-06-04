package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass
import model.type.IWater

class HojaAfilada : AttackMovement<IWater, IFire, IGrass>(
    name = "Hoja Afilada",
    damage = 50f,
    efectiveAgainst = IWater::class,
    veryWeakAgainst = IFire::class,
    inmuneTo = IGrass::class
) {
}