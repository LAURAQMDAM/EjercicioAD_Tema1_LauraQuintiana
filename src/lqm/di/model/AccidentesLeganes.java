package lqm.di.model;

import util.Util;

import java.util.Date;

public class AccidentesLeganes {

    private String num_Expediente;
    private Date fecha;
    private Date hora;
    private String localizacion;
    private int numero;
    private int codDistrito;
    private String distrito;
    private String tipoAccidente;
    private String estadoMetereologico;
    private String tipoVehiculo;
    private String tipoPersona;
    private String rangoEdad;
    private String sexo;
    private String codLexividad;
    private String lexividad;
    private double coordenadaX;
    private double coordenadaY;
    private boolean positivaDrogas;
    private boolean positivaAlcohol;

    public AccidentesLeganes(){}

    public AccidentesLeganes(String[] campos){

        this.num_Expediente= campos[0];
        this.fecha= Util.fechas(campos[1]);
        this.hora= Util.fechas(campos[2]);
        this.localizacion=campos[3];
        this.numero= Integer.parseInt(campos[4]);
        this.codDistrito= Integer.parseInt(campos[5]);
        this.distrito=campos[6];
        this.tipoAccidente= campos[7];
        this.estadoMetereologico= campos[8];
        this.tipoVehiculo= campos[9];
        this.tipoPersona= campos[10];
        this.rangoEdad= campos[11];
        this.sexo= campos[12];
        this.codLexividad= campos[13];
        this.lexividad= campos[14];
        this.coordenadaX= Double.parseDouble(campos[15]);
        this.coordenadaY= Double.parseDouble(campos[16]);
        this.positivaAlcohol= Boolean.parseBoolean(campos[17]);
        this.positivaDrogas= Boolean.parseBoolean(campos[18]);

    }

    public String getNum_Expediente() {
        return num_Expediente;
    }

    public void setNum_Expediente(String num_Expediente) {
        this.num_Expediente = num_Expediente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    public String getEstadoMetereologico() {
        return estadoMetereologico;
    }

    public void setEstadoMetereologico(String estadoMetereologico) {
        this.estadoMetereologico = estadoMetereologico;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodLexividad() {
        return codLexividad;
    }

    public void setCodLexividad(String codLexividad) {
        this.codLexividad = codLexividad;
    }

    public String getLexividad() {
        return lexividad;
    }

    public void setLexividad(String lexividad) {
        this.lexividad = lexividad;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
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

    @Override
    public String toString() {
        return "AccidentesLeganes{" +
                "num_Expediente=" + num_Expediente +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", localizacion='" + localizacion + '\'' +
                ", numero=" + numero +
                ", codDistrito=" + codDistrito +
                ", distrito='" + distrito + '\'' +
                ", tipoAccidente='" + tipoAccidente + '\'' +
                ", estadoMetereologico='" + estadoMetereologico + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", tipoPersona='" + tipoPersona + '\'' +
                ", rangoEdad='" + rangoEdad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", codLexividad='" + codLexividad + '\'' +
                ", lexividad='" + lexividad + '\'' +
                ", coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                ", positivaDrogas=" + positivaDrogas +
                ", positivaAlcohol=" + positivaAlcohol +
                '}';
    }
}
