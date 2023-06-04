package model.movement

import model.movement.functionality.AttackMovement
import model.type.IElectric
import model.type.INormal
import model.type.IWater


class Rayo : AttackMovement<IWater, INormal, IElectric>(
    name = "Rayo",
    damage = 100f,
    efectiveAgainst = IWater::class,
    veryWeakAgainst = INormal::class,
    inmuneTo = IElectric::class
)