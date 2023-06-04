import repository.PokemonDictionary
import model.battle.Battle
import model.pokemon.*
import service.Selector

var selector: Selector = Selector()

fun main(args: Array<String>) {


    println("--------------------- PROCESO DE SELECCIÓN ---------------------")
    selector.showAvailablePokemons()
    var pokemon1: IPokemon = selector.selectPokemon()
    var pokemon2: IPokemon = selector.selectPokemon()

    println("--------------------- ¡EMPIEZA LA BATALLA! ---------------------")

    var battle: Battle = Battle(pokemon1, pokemon2)
    battle.fight()
}

