/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yoselin
 */
public class TipoCliente {
    private String nombre;
    private int codigo;

    public TipoCliente(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
       @Override
    public String toString() {
        return nombre;
    }
}
