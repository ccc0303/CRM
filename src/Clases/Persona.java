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

        if ((identificacion.toString().length() < 6)
                || (identificacion.toString().length() > 11)) {
            throw new Exception("N° De Identificacion No Valido");
        }
        this.identificacion = identificacion;
        this.nombre = nombre;

    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombre;
    }

}
