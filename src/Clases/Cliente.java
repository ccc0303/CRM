/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Cristian
 */
public class Cliente extends Persona {

    private String email;
    private long telefono;
    private TipoCliente tipo_cliente;

    //miame
    public Cliente(String email, long telefono, Long identificacion, String nombre,
            TipoCliente tipo_cliente) throws Exception {
        super(identificacion, nombre);
        this.email = email;
        this.telefono = telefono;
        this.tipo_cliente = tipo_cliente;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefono() {
        return telefono;
    }

    public TipoCliente getTipo_cliente() {
        return tipo_cliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

 
}
