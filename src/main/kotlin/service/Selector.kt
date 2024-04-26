package service

import model.pokemon.IPokemon
import repository.PokemonDictionary

class Selector {

    private var pokemonRepository: PokemonDictionary = PokemonDictionary()

    fun showAvailablePokemons(){
        println("Pokemons disponibles:")
        var i: Int = 0
        for (pokemon in pokemonRepository.pokemons) {
            println("${++i} - ${pokemon.value.name}")
        }
    }

    fun selectPokemon(): IPokemon {
        var pokemon: IPokemon?
        println("Escribe el nombre del pokemon")
        do {
            var pokemonName: String = readln()
            pokemon = pokemonRepository.pokemons.get(pokemonName.uppercase());
            if (pokemon == null){
                println("$pokemonName no está disponible, elije otro")
            }
        } while (pokemon == null)
        println("¡${pokemon.name} te elijo a ti!")
        return pokemon
    }
}