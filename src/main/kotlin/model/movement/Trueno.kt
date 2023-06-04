package model.movement

import model.movement.functionality.AttackMovement
import model.type.IElectric
import model.type.INormal
import model.type.IWater

class Trueno : AttackMovement<IWater, INormal, IElectric>(
    name = "Trueno",
    damage = 200f,
    efectiveAgainst = IWater::class,
    veryWeakAgainst = INormal::class,
    inmuneTo = IElectric::class
)