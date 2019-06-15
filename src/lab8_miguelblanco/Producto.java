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
public class Producto {

    String nombre;
    int cantidad;
    int precio;
    String fecha;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, int precio, String fecha) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", fecha=" + fecha + '}';
    }

}
