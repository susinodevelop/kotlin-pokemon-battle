import model.pokemon.*

class PokemonDictionary {

    var pokemons: Map<String, IPokemon> = mapOf(
        "CHARMANDER" to Charmander(),
        "CHARMELEON" to Charmeleon(),
        "CHARIZARD" to Charizard(),
        "SQUIRTLE" to Squirtle(),
        "WARTORTLE" to Wartortle(),
        "BLASTOISE" to Blastoise(),
        "BULBASAUR" to Bulbasaur(),
        "IVISAUR" to Ivisaur(),
        "VENUSAUR" to Venusaur(),
        "PIKACHU" to Pikachu()
    )

}