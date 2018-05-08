/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.CCP;
import Clases.Cliente;
import Clases.Evento;
import Clases.Reservacion;
import Clases.Salones;
import Clases.TipoCliente;
import Ventanas.Login;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Yoselin
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        TipoCliente tc1 = new TipoCliente("Camara De Comercio", 123);
        TipoCliente tc2 = new TipoCliente("Fundacion Progresamos", 111);
        TipoCliente tc3 = new TipoCliente("Estatales", 222);
        TipoCliente tc4 = new TipoCliente("Privados", 333);

        Salones s1 = new Salones("Auditorio", 1111);
        Salones s2 = new Salones("Salon Empresarial", 2222);
        Salones s3 = new Salones("Salon de Exposiciones", 3333);
        Salones s4 = new Salones("Sala 205", 4444);

        Cliente c = new Cliente("oscarwwe4@gmail.com", 3207115241L, 1114838771L, "Oscar Chaves", tc4);
        Cliente c2 = new Cliente("osca4@gmail.com", 3116405309L, 1116275562L, "Cristian Cuero", tc4);

        Evento e = new Evento("Reunion", "Cristian", 10, 1114838772L, s3);


        Reservacion rs1 = new Reservacion(c2, e, LocalTime.parse("12:00:00"), LocalTime.parse("13:00:00"), LocalDate.of(2018, Month.MAY, 29));

        Reservacion rs = new Reservacion(c, e, LocalTime.parse("10:00:00"), LocalTime.parse("11:00:00"), LocalDate.of(2018, Month.MAY, 29));
        Reservacion rs2 = new Reservacion(c, e, LocalTime.parse("10:00:00"), LocalTime.parse("11:00:00"), LocalDate.of(2018, Month.MAY, 30));
        Reservacion rs3 = new Reservacion(c, e, LocalTime.parse("10:00:00"), LocalTime.parse("11:00:00"), LocalDate.of(2018, Month.MAY, 3));

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = Date.from(rs.getFecha_programada().atStartOfDay(ZoneId.systemDefault()).toInstant());
        // String fechaCadena = sdf.format(date);
        //System.out.println("Reserva" + rs.getEvento().isHimnos());
        CCP ccp = new CCP();

        ccp.agregarSalones(s4);
        ccp.agregarSalones(s1);
        ccp.agregarSalones(s2);
        ccp.agregarSalones(s3);

        ccp.agregarTipoCliente(tc4);
        ccp.agregarTipoCliente(tc3);
        ccp.agregarTipoCliente(tc2);
        ccp.agregarTipoCliente(tc1);
        ccp.AgregarCliente(c);

        ccp.AgregarCliente(c2);
        ccp.AgregarReservacion(rs);
        ccp.AgregarReservacion(rs1);
        ccp.AgregarReservacion(rs2);
        ccp.AgregarReservacion(rs3);

        new Login(ccp).setVisible(true);
    }

}
