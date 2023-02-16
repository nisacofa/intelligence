package Modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Entrenador {
    private Integer id;
    private String nombre;
    private String apellidos;
    private LocalDate nacimiento;
    private List<TipoPokemon> tipospreperidos;
    private List<Pokemon> equipoPokemon;

    public Entrenador(Integer id, String nombre, String apellidos, LocalDate nacimiento, List<TipoPokemon> tipospreperidos, List<Pokemon> equipoPokemon) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.tipospreperidos = tipospreperidos;
        this.equipoPokemon = equipoPokemon;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public List<TipoPokemon> getTipospreperidos() {
        return tipospreperidos;
    }

    public void setTipospreperidos(List<TipoPokemon> tipospreperidos) {
        this.tipospreperidos = tipospreperidos;
    }

    public List<Pokemon> getEquipoPokemon() {
        return equipoPokemon;
    }

    public void setEquipoPokemon(List<Pokemon> equipoPokemon) {
        this.equipoPokemon = equipoPokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrenador that = (Entrenador) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(nacimiento, that.nacimiento) && Objects.equals(tipospreperidos, that.tipospreperidos) && Objects.equals(equipoPokemon, that.equipoPokemon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, nacimiento, tipospreperidos, equipoPokemon);
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacimiento=" + nacimiento +
                ", tipospreperidos=" + tipospreperidos +
                ", equipoPokemon=" + equipoPokemon +
                '}';
    }
}

