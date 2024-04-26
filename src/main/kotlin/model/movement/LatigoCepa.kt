package model.movement

import model.movement.functionality.AttackMovement
import model.type.IFire
import model.type.IGrass

class LatigoCepa : AttackMovement<IGrass, IFire, IGrass>(
    name = "Latigo Cepa",
    damage = 25f,
    efectiveAgainst = IGrass::class,
    veryWeakAgainst = IFire::class,
    inmuneTo = IGrass::class
) {
}