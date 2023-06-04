import model.battle.Battle
import model.pokemon.*

var pokemonDictionary: PokemonDictionary = PokemonDictionary()

fun main(args: Array<String>) {

    println("Pokemons disponibles:")
    var i: Int = 0
    for (pokemon in pokemonDictionary.pokemons) {
        println("${++i} - ${pokemon.value.name}")
    }
    println("--------------------- PROCESO DE SELECCIÓN ---------------------")

    var pokemon1: IPokemon = takePokemon()
    var pokemon2: IPokemon = takePokemon()

    println("--------------------- ¡EMPIEZA LA BATALLA! ---------------------")

    var battle: Battle = Battle(pokemon1, pokemon2)
    battle.fight()
}

fun takePokemon(): IPokemon {
    var pokemon: IPokemon?
    println("Escribe el nombre del pokemon")
    do {
        var pokemonName: String = readln()
        pokemon = pokemonDictionary.pokemons.get(pokemonName.uppercase());
        if (pokemon == null){
            println("$pokemonName no está disponible, elije otro")
        }
    } while (pokemon == null)
    println("¡${pokemon.name} te elijo a ti!")
    return pokemon
}