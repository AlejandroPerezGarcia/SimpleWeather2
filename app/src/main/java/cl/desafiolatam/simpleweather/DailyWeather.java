package cl.desafiolatam.simpleweather;

public class DailyWeather {
    private String ciudad;
    private String fecha;
    private String dibujo;
    private String temperatura;
    private String grado;

    public DailyWeather(String ciudad, String fecha, String dibujo, String temperatura, String grado) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.dibujo = dibujo;
        this.temperatura = temperatura;
        this.grado = grado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", dibujo='" + dibujo + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", grado='" + grado + '\'' +
                '}';
    }
}
