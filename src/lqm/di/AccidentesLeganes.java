package lqm.di;

import java.time.LocalDate;
import java.time.LocalTime;

public class AccidentesLeganes {

    private String num_Expediente;
    private String localizacion;
    private String distrito;
    private boolean positivaDrogas;
    private boolean positivaAlcohol;
    private String sexo;
    private LocalTime hora;
    private String estadoMeterologico;
    private LocalDate fecha;
    private String tipoVehiculo;

    public AccidentesLeganes() {
    }

    public AccidentesLeganes(String num_Expediente, LocalDate fecha,LocalTime hora, String localizacion, String distrito,String sexo,  String estadoMeterologico, String tipoVehiculo, boolean positivaDrogas, boolean positivaAlcohol) {
        this.num_Expediente = num_Expediente;
        this.localizacion = localizacion;
        this.distrito = distrito;
        this.positivaDrogas = positivaDrogas;
        this.positivaAlcohol = positivaAlcohol;
        this.sexo = sexo;
        this.hora = hora;
        this.estadoMeterologico = estadoMeterologico;
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getNum_Expediente() {
        return num_Expediente;
    }

    public void setNum_Expediente(String num_Expediente) {
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

    @Override
    public String toString() {
        return "AccidentesLeganes{" +
                "num_Expediente='" + num_Expediente + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", distrito='" + distrito + '\'' +
                ", positivaDrogas=" + positivaDrogas +
                ", positivaAlcohol=" + positivaAlcohol +
                ", sexo='" + sexo + '\'' +
                ", hora=" + hora +
                ", estadoMeterologico='" + estadoMeterologico + '\'' +
                ", fecha=" + fecha +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccidentesLeganes)) return false;

        AccidentesLeganes that = (AccidentesLeganes) o;

        if (positivaDrogas != that.positivaDrogas) return false;
        if (positivaAlcohol != that.positivaAlcohol) return false;
        if (!num_Expediente.equals(that.num_Expediente)) return false;
        if (!localizacion.equals(that.localizacion)) return false;
        if (!distrito.equals(that.distrito)) return false;
        if (!sexo.equals(that.sexo)) return false;
        if (!hora.equals(that.hora)) return false;
        if (!estadoMeterologico.equals(that.estadoMeterologico)) return false;
        if (!fecha.equals(that.fecha)) return false;
        return tipoVehiculo.equals(that.tipoVehiculo);
    }

    @Override
    public int hashCode() {
        int result = num_Expediente.hashCode();
        result = 31 * result + localizacion.hashCode();
        result = 31 * result + distrito.hashCode();
        result = 31 * result + (positivaDrogas ? 1 : 0);
        result = 31 * result + (positivaAlcohol ? 1 : 0);
        result = 31 * result + sexo.hashCode();
        result = 31 * result + hora.hashCode();
        result = 31 * result + estadoMeterologico.hashCode();
        result = 31 * result + fecha.hashCode();
        result = 31 * result + tipoVehiculo.hashCode();
        return result;
    }
}
