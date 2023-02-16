package Utilidades;

import Modelos.Entrenador;
import Modelos.Pokemon;
import Modelos.TipoPokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class UtilidadesPokemon {

    //Ejercicio 1) 1
    public List<Pokemon> obtenerPokemonConTipos(List<Pokemon> pokemons, List<TipoPokemon> tipos){
        List<Pokemon> pokemonsFiltrados = new ArrayList<>();
        for (Pokemon pokemon:pokemons){
            List<TipoPokemon> tiposCoincidentes = new ArrayList<>(pokemon.getTipos());
            tiposCoincidentes.retainAll(tipos);
            if(!tiposCoincidentes.isEmpty()){
                pokemonsFiltrados.add(pokemon);
            }
        }
        return pokemonsFiltrados;
    }

    //Ejercicio 1) 2
    public Map<TipoPokemon, List<Pokemon>> obtenerPokemonPurosPorTipo(List<Pokemon> pokemons){
        Map<TipoPokemon, List<Pokemon>> pokemonsPorTipo = new HashMap<>();

        for (Pokemon pokemon:pokemons){
            if (pokemon.getTipos().size()==1) {
                if (pokemonsPorTipo.containsKey(pokemon.getTipos().get(0))){
                    pokemonsPorTipo.get(pokemon.getTipos().get(0)).add(pokemon);
                }else
                {
                    pokemonsPorTipo.put(pokemon.getTipos().get(0),List.of(pokemon));
                }

            }
        }
        return pokemonsPorTipo;




    }
    //Ejercicio 4) 4
    public Map<Entrenador, Integer> repartirPokemon(List<Entrenador> entrenadores, List<Pokemon> pokemon){
        int numeroCadaEntrenador=pokemon.size()/entrenadores.size();

        Map<Entrenador, List<Pokemon>> pokemonsyEntrenadores = new HashMap<>();

        for(Entrenador entrenador:entrenadores){
            int numero=0;
            pokemonsyEntrenadores.put(entrenador, null);
            for (Pokemon pokemon1:pokemon){
                if (numero<numeroCadaEntrenador){
                    pokemonsyEntrenadores.get(entrenador).add(pokemon1);
                    pokemon.remove(pokemon1);
                    numero+=1;
                }
            }
        }
        Map<Entrenador, Integer> pokemonsEntrenadores = new HashMap<>();
        for (Entrenador entrenador:pokemonsyEntrenadores.keySet()){
            pokemonsEntrenadores.put(entrenador,0);
            for (Pokemon pokemon2:pokemonsyEntrenadores.get(entrenador)){
                for (TipoPokemon tipoPokemon:pokemon2.getTipos()){
                    if (entrenador.getTipospreperidos().contains(tipoPokemon)){
                        pokemonsEntrenadores.put(entrenador, pokemonsEntrenadores.get(entrenador)+1);
                    }
                }
            }
        }
        return pokemonsEntrenadores;

    }
    //Ejercicio 4) 5
    public void subirAlNivel(Pokemon pokemon, Integer nivel){

    }

}
