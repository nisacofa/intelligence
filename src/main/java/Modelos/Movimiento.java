package Modelos;

import java.util.List;
import java.util.Objects;

public class Movimiento {
    private Integer id;
    private String nombre;
    private TipoPokemon tipo;
    private TipoAtaque tipoAtaque;
    private Integer potencia;

    public Movimiento(Integer id, String nombre, TipoPokemon tipo, TipoAtaque tipoAtaque, Integer potencia) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipoAtaque = tipoAtaque;
        this.potencia = potencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(TipoAtaque tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movimiento that = (Movimiento) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && tipo == that.tipo && tipoAtaque == that.tipoAtaque && Objects.equals(potencia, that.potencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipo, tipoAtaque, potencia);
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", tipoAtaque=" + tipoAtaque +
                ", potencia=" + potencia +
                '}';
    }
}
