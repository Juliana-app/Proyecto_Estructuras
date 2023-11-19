import javax.swing.JOptionPane;

public class Interfaz {
    public static void main(String[] args) {

        Peliculas p = new Peliculas();
        CentroComercial c = new CentroComercial();

        // Centros
        // comerciales-----------------------------------------------------------------------
        String titanP = c.lugarCentro("Titán Plaza", 4.70, -74.09);
        String diverP = c.lugarCentro("Diver Plaza", 4.70, -74.12);
        String portal = c.lugarCentro("Portal 80", 4.70, -74.11);
        String nuestroB = c.lugarCentro("Nuestro Bogotá ", 4.68, -74.12);
        String unicentroO = c.lugarCentro("Unicentro de Occidente", 4.72, -74.11);
        String andino = c.lugarCentro("Andino", 4.67, -74.05);
        String metropolis = c.lugarCentro("Metrópolis + ", 4.68, -74.08);
        String granE = c.lugarCentro("Gran Estación", 4.64, -74.10);
        String salitreP = c.lugarCentro("Salitre Plaza", 4.65, -74.11);
        String santafe = c.lugarCentro("Santafé", 4.76, -74.05);

        // Peliculas----------------------------------------------------------------------------------------
        String marvel = p.descripcionPelicula(" The marvels ", " Admiración ");
        String saw = p.descripcionPelicula(" Saw X ", " Venganza ");
        String fnaf = p.descripcionPelicula(" Five Nights At Freddy´s ", " Nostalgia");
        String trolls = p.descripcionPelicula(" Trolls Band Together ", " Felicidad");
        String juega = p.descripcionPelicula(" Juega o muere ", " Intriga ");
        String juegosH = p.descripcionPelicula(" Los juegos del hambre ", " Intriga ");
        String pawP = p.descripcionPelicula(" Paw Patrol ", " Ternura ");
        String exorcista = p.descripcionPelicula(" El exorcista : Creyentes ", " Miedo ");
        String hypno = p.descripcionPelicula(" Hypnotic ", " Suspenso ");

        String respuesta = JOptionPane.showInputDialog("En que centro comercial deseas ver la película");

        if (respuesta.equalsIgnoreCase("Titán Plaza")) {
            JOptionPane.showMessageDialog(null, "Esta es la cartelera que tenemos disponible: ");
            JOptionPane.showMessageDialog(null, marvel);
            JOptionPane.showMessageDialog(null, saw);
            JOptionPane.showMessageDialog(null, fnaf);
            JOptionPane.showMessageDialog(null, trolls);
            JOptionPane.showMessageDialog(null, juega);
            JOptionPane.showMessageDialog(null, juegosH);
            JOptionPane.showMessageDialog(null, pawP);
            JOptionPane.showMessageDialog(null, exorcista);
            JOptionPane.showMessageDialog(null, hypno);

        }

    }
}