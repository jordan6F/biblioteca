package Entities;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Prestar libro");
            System.out.println("6. Devolver libro");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ingrese el ISBN del libro: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Ingrese el año de publicación del libro: ");
                        int año = scanner.nextInt();
                        biblioteca.agregarLibro(new Libro(titulo, autor, isbn, año));
                        break;
                    case 2:
                        System.out.print("Ingrese el título del libro a buscar: ");
                        String tituloBusqueda = scanner.nextLine();
                        ArrayList<Libro> librosPorTitulo = biblioteca.buscarPorTitulo(tituloBusqueda);
                        if (librosPorTitulo.isEmpty()) {
                            System.out.println("No se encontraron libros con ese título.");
                        } else {
                            System.out.println("Libros encontrados:");
                            for (Libro libro : librosPorTitulo) {
                                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn() + ", Año: " + libro.getAño());
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el autor del libro a buscar: ");
                        String autorBusqueda = scanner.nextLine();
                        ArrayList<Libro> librosPorAutor = biblioteca.buscarPorAutor(autorBusqueda);
                        if (librosPorAutor.isEmpty()) {
                            System.out.println("No se encontraron libros de ese autor.");
                        } else {
                            System.out.println("Libros encontrados:");
                            for (Libro libro : librosPorAutor) {
                                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn() + ", Año: " + libro.getAño());
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Lista de todos los libros:");
                        biblioteca.mostrarLibros();
                        break;
                    case 5:
                        System.out.print("Ingrese el ISBN del libro a prestar: ");
                        String isbnPrestamo = scanner.nextLine();
                        biblioteca.prestarLibro(isbnPrestamo);
                        break;
                    case 6:
                        System.out.print("Ingrese el ISBN del libro a devolver: ");
                        String isbnDevolucion = scanner.nextLine();
                        biblioteca.devolverLibro(isbnDevolucion);
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema...");
                        System.exit(0);
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }
    }
}
