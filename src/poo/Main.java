/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author yursd
 */
public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien");
        Libro libro2 = new Libro("1984", "George Orwell");

        // Mostrar información de los libros
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());

        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan Pérez");
        Usuario usuario2 = new Usuario("Ana García");

        // Prestar libros
        usuario1.prestarLibro(libro1);
        usuario2.prestarLibro(libro2);

        // Devolver un libro
        usuario1.devolverLibro(libro1);

        // Listar libros prestados por un usuario
        usuario2.listarLibrosPrestados();
    }
}


