public class Peliculas {
    public String nombre;
    public String sentimiento;

    public String descripcionPelicula(String nombre, String sentimiento) {
        this.nombre = nombre;
        this.sentimiento = sentimiento;
        return this.nombre + " " + this.sentimiento;
    }

}
