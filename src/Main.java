import Clases.Ejercicio3.Album;
import Clases.Ejercicio3.Artista;
import Clases.Ejercicio3.Cancion;
import Clases.Ejercicio3.Reproductor;
import Enums.Genero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int control = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Que ejercicio quieres ejecutar?");

        control = sc.nextInt();
        switch (control) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                Artista artista1 = new Artista("Queen", 50, "UK");
                Artista artista2 = new Artista("David Bowie", 69, "UK");

                Album album1 = new Album("A Night at the Opera", "1975", artista1);

                Cancion cancion1 = new Cancion("Bohemian Rhapsody", 5.55, Genero.ROCK, album1, null);
                Cancion cancion2 = new Cancion("Under Pressure", 4.08, Genero.ROCK, album1, artista2);

                Reproductor miLista = new Reproductor();
                miLista.añadirCancion(cancion1);
                miLista.añadirCancion(cancion2);

                miLista.verMiLista();
                miLista.reproducir();
                miLista.eliminarCancion();
                miLista.verMiLista();
                break;
            default:
                System.out.println("Ese ejercicio no existe");
                break;
        }

    }
}