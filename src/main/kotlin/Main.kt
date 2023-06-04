import model.battle.Battle
import model.movement.*
import model.pokemon.Bulbasaur
import model.pokemon.Charmander
import model.pokemon.Squirtle
import model.type.IFire

fun main(args: Array<String>) {
    var charmander = Charmander(
        movements = mapOf(
            "Ascuas" to Ascuas(),
            "Reflejo" to Reflejo()
        )
    )

    var bulbasaur = Bulbasaur(
        movements = mapOf(
            "LatigoCepa" to LatigoCepa(),
            "Latigo" to Latigo()
        )
    )

    var squirtle = Squirtle(
        movements = mapOf(
            "Burbuja" to Burbuja(),
            "Reflejo" to Reflejo()
        )
    )

    var battle: Battle = Battle(charmander, squirtle)
    battle.fight()
}