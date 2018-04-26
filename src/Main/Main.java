/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.CCP;
import Clases.Cliente;
import Clases.Salones;
import Clases.TipoCliente;
import Ventanas.Login;

/**
 *
 * @author Yoselin
 */
public class Main {

    /**
     * @param args the command line arguments
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

        new Login(ccp).setVisible(true);
    }

}
