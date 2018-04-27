package Clases;

public class Evento {

    private String nombre;
    private String responsableEvento;
    private int num_asistentes;
    private boolean himnos, manteles, papelografo, mesas, señalizador, 
                    video_beam, portatil, telon, microfono;
    private TipoSilleteria silleteria;
    private Long idResponsableEvento;
    private Salones salon;

    public Evento(String nombre, String responsableEvento, int num_asistentes, Long idResponsableEvento, Salones salon) {
        this.nombre = nombre;
        this.responsableEvento = responsableEvento;
        this.num_asistentes = num_asistentes;
        this.idResponsableEvento = idResponsableEvento;
        this.salon = salon;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getResponsableEvento() {
        return responsableEvento;
    }

    public int getNum_asistentes() {
        return num_asistentes;
    }

    public boolean isHimnos() {
        return himnos;
    }

    public boolean isManteles() {
        return manteles;
    }

    public boolean isPapelografo() {
        return papelografo;
    }

    public boolean isMesas() {
        return mesas;
    }

    public boolean isSeñalizador() {
        return señalizador;
    }

    public boolean isVideo_beam() {
        return video_beam;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public boolean isTelon() {
        return telon;
    }

    public boolean isMicrofono() {
        return microfono;
    }

    public TipoSilleteria getSilleteria() {
        return silleteria;
    }

    public Long getIdResponsableEvento() {
        return idResponsableEvento;
    }

    public Salones getSalon() {
        return salon;
    }
    
 
}
