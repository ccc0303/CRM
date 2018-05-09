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

    public Evento(String nombre, String responsableEvento, int num_asistentes, Long idResponsableEvento, Salones salon) throws Exception {

        if (nombre == null) {
            throw new Exception("Nombre No Puede Ser Vacio");
        }
        if (responsableEvento == null) {
            throw new Exception("El Nombre Del Responsable No Puede Ser Vacio No Puede Ser Vacio");
        }
        if (num_asistentes == 0) {
            throw new Exception("Numero Asistente No Puede Ser 0");
        }
        String c = Long.toString(idResponsableEvento);
        if ((c.length() > 6) && (c.length() < 11)) {

            this.idResponsableEvento = idResponsableEvento;
        } else {
            throw new Exception("Identificacion Del Responsable No Valida");
        }
        
        this.nombre = nombre;
        this.responsableEvento = responsableEvento;
        this.num_asistentes = num_asistentes;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResponsableEvento(String responsableEvento) {
        this.responsableEvento = responsableEvento;
    }

    public void setNum_asistentes(int num_asistentes) {
        this.num_asistentes = num_asistentes;
    }

    public void setHimnos(boolean himnos) {
        this.himnos = himnos;
    }

    public void setManteles(boolean manteles) {
        this.manteles = manteles;
    }

    public void setPapelografo(boolean papelografo) {
        this.papelografo = papelografo;
    }

    public void setMesas(boolean mesas) {
        this.mesas = mesas;
    }

    public void setSeñalizador(boolean señalizador) {
        this.señalizador = señalizador;
    }

    public void setVideo_beam(boolean video_beam) {
        this.video_beam = video_beam;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public void setTelon(boolean telon) {
        this.telon = telon;
    }

    public void setMicrofono(boolean microfono) {
        this.microfono = microfono;
    }

    public void setSilleteria(TipoSilleteria silleteria) {
        this.silleteria = silleteria;
    }

    public void setIdResponsableEvento(Long idResponsableEvento) {
        this.idResponsableEvento = idResponsableEvento;
    }

    public void setSalon(Salones salon) {
        this.salon = salon;
    }

}
