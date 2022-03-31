package lqm.di.model;

public class AccidentesLeganes {

    private String numExpediente;
    private String fecha;
    private String hora;
    private String localizacion;
    private String numero;
    private String codDistrito;
    private String distrito;
    private String tipoAccidente;
    private String estadoMetereologico;
    private String tipoVehiculo;
    private String tipoPersona;
    private String rangoEdad;
    private String sexo;
    private String codLexividad;
    private String lexividad;
    private String coordenadaX;
    private double coordenadaY;
    private String positivaDrogas;
    private String positivaAlcohol;

    public AccidentesLeganes() {
    }

    public AccidentesLeganes(String[] campos){

        this.numExpediente = campos[0];
        this.fecha= campos[1];
        this.hora= campos[2];
        this.localizacion=campos[3];
        this.numero= campos[4];
        this.codDistrito= campos[5];
        this.distrito=campos[6];
        this.tipoAccidente= campos[7];
        this.estadoMetereologico= campos[8];
        this.tipoVehiculo= campos[9];
        this.tipoPersona= campos[10];
        this.rangoEdad= campos[11];
        this.sexo= campos[12];
        this.codLexividad= campos[13];
        this.lexividad= campos[14];
        this.coordenadaX= campos[15];
        this.coordenadaY = Double.parseDouble(campos[16]);
      /*  this.positivaDrogas= campos[17];
        this.positivaAlcohol= Boolean.parseBoolean(campos[18]);*/
/*
        this.positivaDrogas =campos[17].equals("V") ? true : false);
        this.positivaAlcohol=(campos[18].equals("V") ? true : false);*/

    }

    public AccidentesLeganes(String numExpediente, String fecha, String hora, String localizacion, String numero, String codDistrito, String distrito, String tipoAccidente, String estadoMetereologico, String tipoVehiculo, String tipoPersona, String rangoEdad, String sexo, String codLexividad, String lexividad, String coordenadaX, double coordenadaY, String positivaDrogas, String positivaAlcohol) {
        this.numExpediente = numExpediente;
        this.fecha = fecha;
        this.hora = hora;
        this.localizacion = localizacion;
        this.numero = numero;
        this.codDistrito = codDistrito;
        this.distrito = distrito;
        this.tipoAccidente = tipoAccidente;
        this.estadoMetereologico = estadoMetereologico;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoPersona = tipoPersona;
        this.rangoEdad = rangoEdad;
        this.sexo = sexo;
        this.codLexividad = codLexividad;
        this.lexividad = lexividad;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.positivaDrogas = positivaDrogas;
        this.positivaAlcohol = positivaAlcohol;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodDistrito() {
        return codDistrito;
    }

    public void setCodDistrito(String codDistrito) {
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

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getPositivaDrogas() {
        return positivaDrogas;
    }

    public void setPositivaDrogas(String positivaDrogas) {
        this.positivaDrogas = positivaDrogas;
    }

    public String isPositivaAlcohol() {
        return positivaAlcohol;
    }

    public void setPositivaAlcohol(String positivaAlcohol) {
        this.positivaAlcohol = positivaAlcohol;
    }

    @Override
    public String toString() {
        return "AccidentesLeganes{" +
                "num_Expediente=" + numExpediente +
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
