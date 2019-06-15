/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_miguelblanco;

/**
 *
 * @author migue
 */
public class Cliente {

    int Id;
    String nombre;
    int cuenta;
    String contrasena;
    String numeroidentidad;
    int saldodisponible;

    public Cliente(int Id, String nombre, int cuenta, String contrasena, String numeroidentidad, int saldodisponible) {
        this.Id = Id;
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.numeroidentidad = numeroidentidad;
        this.saldodisponible = saldodisponible;
    }

    public Cliente() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNumeroidentidad() {
        return numeroidentidad;
    }

    public void setNumeroidentidad(String numeroidentidad) {
        this.numeroidentidad = numeroidentidad;
    }

    public int getSaldodisponible() {
        return saldodisponible;
    }

    public void setSaldodisponible(int saldodisponible) {
        this.saldodisponible = saldodisponible;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id=" + Id + ", nombre=" + nombre + ", cuenta=" + cuenta + ", contrasena=" + contrasena + ", numeroidentidad=" + numeroidentidad + ", saldodisponible=" + saldodisponible + '}';
    }

}
