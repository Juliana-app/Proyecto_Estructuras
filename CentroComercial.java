public class CentroComercial {

    public String nombre;
    public double latitud;
    public double longitud;

    public String lugarCentro(String nombre, double latitud, double longitud) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;

        return this.nombre + " " + this.latitud + " " + this.longitud;
    }

}
