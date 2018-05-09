/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Yoselin
 */
public class CCP {

    private LinkedList<Cliente> clientes;
    private LinkedList<Salones> salones;
    private LinkedList<Reservacion> reservaciones;
    private LinkedList<TipoCliente> tipoClientes;

    public CCP() throws Exception{
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

    public void agregarTipoCliente(TipoCliente tc) {
        this.tipoClientes.add(tc);
    }

    public void agregarSalones(Salones s) {
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
                    && (this.reservaciones.get(i).getHora_inicio().getHour() == r.getHora_inicio().getHour())) {
                throw new Exception("No Se Puede Agregar Dos Reservaciones A La Misma Hora");
            } else {
                i++;
            }
        }
        this.reservaciones.add(r);
    }

    public LinkedList<Reservacion> ConsulttarCliente(Long cc) {

        LinkedList<Reservacion> reser = new LinkedList<>();
        int i = 0;

        while (this.reservaciones.size() > i) {
            if (Objects.equals(this.reservaciones.get(i).getCliente().getIdentificacion(), cc)) {
                reser.add(this.reservaciones.get(i));
                i++;
            } else {
                i = i + 1;
            }
        }
        return reser;
    }
    
    public LinkedList<Reservacion> ConsulttarReservacionesDisponibles(Long cc) {

        LinkedList<Reservacion> reser = new LinkedList<>();
        int i = 0;

        while (this.reservaciones.size() > i) {
            if ((Objects.equals(this.reservaciones.get(i).getCliente().getIdentificacion(), cc))
                    &&(this.reservaciones.get(i).getFecha_programada().isAfter(LocalDate.now()))
                        &&(this.reservaciones.get(i).isEstado())) {
                reser.add(this.reservaciones.get(i));
                i++;
            } else {
                i = i + 1;
            }
        }
        return reser;
    }

    public LinkedList<Reservacion> reservacionesHora(String s, Salones sal) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        LinkedList<Reservacion> reser = new LinkedList<>();
        int i = 0;

        while (this.reservaciones.size() > i) {

            Reservacion rs = this.reservaciones.get(i);
            Date date = Date.from(rs.getFecha_programada().atStartOfDay(ZoneId.systemDefault()).toInstant());
            String fechaCadena = sdf.format(date);
            if ((s.equalsIgnoreCase(fechaCadena)
                    && (sal.getNombre().equalsIgnoreCase(rs.getEvento().getSalon().getNombre())))) {

                reser.add(rs);
                i++;

            } else {
                i++;
            }
          

        }
          return reser;
    }

    
}
