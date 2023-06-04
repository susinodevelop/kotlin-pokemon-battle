package model.movement

import model.movement.functionality.AttackMovement
import model.type.IElectric
import model.type.INormal
import model.type.IWater

class Impactrueno : AttackMovement<IWater, INormal, IElectric>(
    name = "Impactrueno",
    damage = 50f,
    efectiveAgainst = IWater::class,
    veryWeakAgainst = INormal::class,
    inmuneTo = IElectric::class
) {
}