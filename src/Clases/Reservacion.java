package Clases;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class Reservacion {

    private int codigo;
    private Cliente cliente;
    private Evento evento; 
    private Time hora_inicio;
    private Time hora_fin;
    private LocalDate fecha_solicitud;
    private Date fecha_programada;
    
    private boolean estado;

    public Reservacion(Cliente cliente, Evento evento, Time hora_inicio, Time hora_fin, LocalDate fecha_solicitud, Date fecha_programada) {
        this.cliente = cliente;
        this.evento = evento;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_programada = fecha_programada;
        this.estado = true;
        this.codigo = 1;
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

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public LocalDate getFecha_solicitud() {
        return this.fecha_solicitud = LocalDate.now();
    }

    public Date getFecha_programada() {
        return fecha_programada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
