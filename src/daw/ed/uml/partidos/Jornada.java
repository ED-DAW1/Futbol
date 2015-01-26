package daw.ed.uml.partidos;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Jornada {

    private int n;
    private ArrayList<PartidoFutbol> partidos;
    
    public Jornada(int n) {
        this.n = n;
        partidos = new ArrayList<>();
    }

    public void load(String fileName) {
        File fichero = new File(fileName);
        try (Scanner s = new Scanner(fichero)) {
            // Obtengo los datos de los partidos de fútbol del fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
                String[] cortarString = linea.split("::");		// Obtengo los datos del partido de futbol
                PartidoFutbol partido = new PartidoFutbol();	// Creo un objeto de la clase "PartidoFutbol"

                // Pongo los atributos al objeto "partido"
                

                // Añadimos el objeto "partido" al ArrayList
                
            }

        } catch (FileNotFoundException | NumberFormatException e) {
            System.err.println(e);
            System.exit(0);
        }
    }
    
    @Override
    public String toString() {
        // Genero un string con los resultados de la jornada
        return "";        
    }

}

