package Clases;

/**
 *
 * @author salasistemas
 */
public class Persona {
    private Long identificacion;
    private String nombre;
   ;

    public Persona(Long identificacion, String nombre) throws Exception {

        if (nombre == null || "".equals(nombre.trim())) {
            throw new Exception("El Nombre no puede ser nulo o vacio");
        }

        String c = Long.toString(identificacion);

        if ((c.length() > 6) && (c.length() < 11)) {
            this.identificacion = identificacion;
        } else {
            throw new Exception(" N° De Identificacion No Valida");
        }
        this.nombre = nombre;
        
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombre;
    }

}
