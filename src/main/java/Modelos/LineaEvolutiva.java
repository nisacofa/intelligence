package Modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class LineaEvolutiva {
    private Pokemon pokemon;
    private Integer nivelParaEvolucionar;
    private Integer orden;

    public LineaEvolutiva(Pokemon pokemon, Integer nivelParaEvolucionar, Integer orden) {
        this.pokemon = pokemon;
        this.nivelParaEvolucionar = nivelParaEvolucionar;
        this.orden = orden;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Integer getNivelParaEvolucionar() {
        return nivelParaEvolucionar;
    }

    public void setNivelParaEvolucionar(Integer nivelParaEvolucionar) {
        this.nivelParaEvolucionar = nivelParaEvolucionar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaEvolutiva that = (LineaEvolutiva) o;
        return Objects.equals(pokemon, that.pokemon) && Objects.equals(nivelParaEvolucionar, that.nivelParaEvolucionar) && Objects.equals(orden, that.orden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemon, nivelParaEvolucionar, orden);
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "LineaEvolutiva{" +
                "pokemon=" + pokemon +
                ", nivelParaEvolucionar=" + nivelParaEvolucionar +
                ", orden=" + orden +
                '}';
    }
}
