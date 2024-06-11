package Entities;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado exitosamente :D");
    }

    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn() + ", Año: " + libro.getAño());
        }
    }

    public void prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado.");
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese ISBN.");
    }

    public void devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto.");
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese ISBN.");
    }

}
