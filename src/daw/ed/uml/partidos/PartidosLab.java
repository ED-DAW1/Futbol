package daw.ed.uml.partidos;

/**
 *
 * @author carlos
 */
public class PartidosLab {
    public static void main(String[] args) {
        Jornada j1 = new Jornada(1);
        j1.load("./data/jornada1.txt");
        System.out.println(j1);
    }
}
