package model.movement.functionality

abstract class DefenseMovement(
    override var name: String,
    var resistance: Float
) : IMovement {
}