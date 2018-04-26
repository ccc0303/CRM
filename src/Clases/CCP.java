/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Yoselin
 */

//niche es una loca
public class CCP {

    private LinkedList<Cliente> clientes;
    private LinkedList<Salones> salones;
    private LinkedList<Reservacion> reservaciones;
    private LinkedList<TipoCliente> tipoClientes;

    public CCP() {
        this.clientes = new LinkedList<>();
        this.salones = new LinkedList<>();
        this.reservaciones = new LinkedList<>();
        this.tipoClientes = new LinkedList<>();
    }

    public Cliente buscarCliente(Long ident) throws Exception {
        int i = 0;
        while (i < this.clientes.size()) {
            if (Objects.equals(ident, this.clientes.get(i).getIdentificacion())) {
                return this.clientes.get(i);
            } else {
                i++;
            }
        }
        throw new Exception("No Hay Ningun Cliente Con El Numero De Identificacion: " + ident);
    }
    
      public void AgregarCliente(Cliente c) throws Exception {
        int i = 0;
        while (this.clientes.size() > i) {
            if (Objects.equals(this.clientes.get(i).getIdentificacion(), c.getIdentificacion())) {
                throw new Exception("No Se Puede Agregar Dos Clientes Con El Mismo Numero De Identificacion");
            } else {
                i++;
            }
        }
        this.clientes.add(c);
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public LinkedList<Reservacion> getReservaciones() {
        return reservaciones;
    }
      
      public void agregarTipoCliente(TipoCliente tc){
          this.tipoClientes.add(tc);
      }
      
      public  void agregarSalones(Salones s){
          this.salones.add(s);
          
      }

    public LinkedList<Salones> getSalones() {
        return salones;
    }

    public LinkedList<TipoCliente> getTipoClientes() {
        return tipoClientes;
    }

      public void AgregarReservacion(Reservacion r) throws Exception {
        int i = 0;
        while (this.reservaciones.size() > i) {
            if ((Objects.equals(this.reservaciones.get(i).getFecha_programada(), r.getFecha_programada()))
                    && (this.reservaciones.get(i).getHora_inicio().getHours() == r.getHora_inicio().getHours())) {
                throw new Exception("No Se Puede Agregar Dos Reservaciones A La Misma Hora");
            } else {
                i++;
            }
        }
        this.reservaciones.add(r);
    }
      
//      public LinkedList<Reservacion> buscarReservacion(Long ident) throws Exception{
//          int i = 0;
//        while (this.reservaciones.size() > i) {
//            if ((Objects.equals(this.reservaciones.get(i).getCliente().getIdentificacion(), ident))) {
//                this.reservaciones.get(i); 
//                i++;
//            } else {
//               i++;
//            }
//        }
//      
//      }
}
