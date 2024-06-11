package Entities;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int año;

    public Libro(String titulo, String autor, String isbn, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAño() {
        return año;
    }
}
