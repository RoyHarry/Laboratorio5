package pe.edu.unmsm.sistemas.segsil.pojos;

public class Observacion {
    private String id;
    private String semana;
    private String observacion;

    public Observacion(String id, String semana, String observacion) {
        this.id = id;
        this.semana = semana;
        this.observacion = observacion;
    }

    public Observacion() {
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
