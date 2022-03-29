package lqm.di;

import java.time.LocalDate;
import java.time.LocalTime;

public class AccidentesLeganes {

    private int num_Expediente;
    private String localizacion;
    private String distrito;
    private boolean positivaDrogas;
    private boolean positivaAlcohol;
    private String sexo;
    private LocalTime hora;
    private String estadoMeterologico;
    private LocalDate fecha;

    public AccidentesLeganes() {
    }

    public AccidentesLeganes(int num_Expediente, String localizacion, String distrito, boolean positivaDrogas, boolean positivaAlcohol, String sexo, LocalTime hora, String estadoMeterologico, LocalDate fecha) {
        this.num_Expediente = num_Expediente;
        this.localizacion = localizacion;
        this.distrito = distrito;
        this.positivaDrogas = positivaDrogas;
        this.positivaAlcohol = positivaAlcohol;
        this.sexo = sexo;
        this.hora = hora;
        this.estadoMeterologico = estadoMeterologico;
        this.fecha = fecha;
    }

    public int getNum_Expediente() {
        return num_Expediente;
    }

    public void setNum_Expediente(int num_Expediente) {
        this.num_Expediente = num_Expediente;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public boolean isPositivaDrogas() {
        return positivaDrogas;
    }

    public void setPositivaDrogas(boolean positivaDrogas) {
        this.positivaDrogas = positivaDrogas;
    }

    public boolean isPositivaAlcohol() {
        return positivaAlcohol;
    }

    public void setPositivaAlcohol(boolean positivaAlcohol) {
        this.positivaAlcohol = positivaAlcohol;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getEstadoMeterologico() {
        return estadoMeterologico;
    }

    public void setEstadoMeterologico(String estadoMeterologico) {
        this.estadoMeterologico = estadoMeterologico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
