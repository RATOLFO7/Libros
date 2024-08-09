/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author yursd
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Libro> librosPrestados = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

   // En el método prestarLibro de la clase Usuario:
public void prestarLibro(Libro libro) {
    if (libro.estaDisponible()) {
        librosPrestados.add(libro);
        libro.prestar();
        System.out.println("El usuario " + nombre + " ha prestado el libro " + libro.getTitulo());
    } else {
        System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
    }
}


    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        libro.devolver();
    }

    public void listarLibrosPrestados() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}
