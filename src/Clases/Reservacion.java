package Clases;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Reservacion {

    
    private int codigo;
    private Cliente cliente;
    private Evento evento; 
    private LocalTime hora_inicio;
    private LocalTime hora_fin;
    private LocalDate fecha_solicitud;
    private LocalDate fecha_programada;
    
    private boolean estado;

    public Reservacion(Cliente cliente, Evento evento, LocalTime hora_inicio, LocalTime hora_fin, LocalDate fecha_programada) {
        this.cliente = cliente;
        this.evento = evento;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.fecha_programada = fecha_programada;
        this.estado = true;
        int numero = (int) (Math.random() * 100000) + 1;
        int numero2 = (int) (Math.random() * 10000) + 1;
        this.codigo = numero * numero2 ;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void codigoAumento (){
        this.codigo = codigo + 1;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }

    public LocalTime getHora_fin() {
        return hora_fin;
    }

    public LocalDate getFecha_solicitud() {
        return this.fecha_solicitud = LocalDate.now();
    }

    public LocalDate getFecha_programada() {
        return fecha_programada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

}
