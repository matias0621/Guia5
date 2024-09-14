package Clases.Ejercicio3;

import Interfaces.Reproduccion;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private Queue<Cancion> miLista;


    @Override
    public void reproducir() {
        if (miLista.isEmpty()){
            System.out.println("No hay Canciones");
        }
        else {
            Cancion c = miLista.peek();
            System.out.println(c.getNombre());
        }
    }

    @Override
    public void añadirCancion(Cancion c) {
        miLista.add(c);
    }

    @Override
    public void eliminarCancion(){
        Scanner sc = new Scanner(System.in);
        if (miLista.isEmpty()){
            System.out.println("No hay Canciones");
        }
        else {
            System.out.println("PAGA EL PREMIUM RATAAAAAAAAAAA!!!!");
        }
    }

    @Override
    public void verMiLista(){
        if (miLista.isEmpty()){
            System.out.println("No hay Canciones");
        }
        else {
                System.out.println(miLista.toString());
        }
    }

    public void cambiarCancion(){
        if (miLista.isEmpty()){
            System.out.println("No hay Canciones");
        }
        else {
            System.out.println("PAGA EL PREMIUM RATAAAAAAAAAAA!!!!");
        }
    }

}
