/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args) {
        int opcion;
        do {
            System.out.println("\n---Menu de biblioteca---");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Agregar libro.");
            System.out.println("3. Prestar libro.");
            System.out.println("4. Devolver libro.");
            System.out.println("5. Libros disponibles.");
            System.out.println("6. Prestamos activos.");
            System.out.println("7: Salir.");
            System.out.println("Seleccione un opcion.");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> registrarCliente();
                case 2 -> agregarLibro();
                case 3 -> prestarLibro();
                case 4 -> devolverLibro();
                case 5 -> mostrarLibrosDisponibles();
                case 6 -> mostrarPrestamos();
                case 7 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("opcion invalida.");
            }

        } while (opcion != 7);

    }

    private static void registrarCliente() {
        System.out.println("Nombre del cliente. ");
        String nombre = scanner.nextLine();
        System.out.println("Correo del cliente: ");
        String correo = scanner.nextLine();
        int id = 0;
        clientes.add(new Cliente(nombre, correo, id));
        System.out.println("Cliente registrado con exito. ");
    }

    private static void agregarLibro(){
        System.out.println("Titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Autor del libro: ");
        String autor = scanner.nextLine();
        libros.add(new Libro(titulo, autor));
        System.out.println("Libro agregado con exito.");
    }

    private static void prestarLibro(){
        if (clientes.isEmpty() || libros.isEmpty()){
            System.out.println("Debe haber al menos un libro y un cliente registrado.");
            return;
        }

        System.out.println("Seleccione al cliente: ");
        for (int i = 0; i < clientes.size() + i++;){
            System.out.println((i + 1) + ". " + clientes.get(i).nombre);
        }
        int cliIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.println("Seleccione libro disponible: ");
        ArrayList<Libro> disponibles = new ArrayList<>();
        for(Libro l : libros){
            if(l.estaDisponible()){
                disponibles.add(l);
            }
        }
        if (disponibles.isEmpty()){
            System.out.println("No hay libros disponibles.");
            return;
        }

        for (int i = 0; i < disponibles.size(); i++){
            System.out.println((i+1) + ". " + disponibles.get(i).getTitulo());
        }
        int libIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        Prestamo nuevo = new Prestamo(clientes.get(cliIdx), disponibles.get(libIdx));
        prestamos.add(nuevo);
        System.out.println("El libro fue prestado con exito.");
    }
    private static void devolverLibro(){
        if(prestamos.isEmpty()){
            System.out.println("No hay prestamos activos. ");
            return;
        }
        System.out.println("Seleccione prestamo a devolver: ");
        for (int i = 0; i < prestamos.size(); i++){
            System.out.println((i + 1) + ". " + prestamos.get(i).getCliente().nombre + prestamos.get(i).getLibro().
            getTitulo());
        }
        int idx = scanner.nextInt() - 1;
        scanner.nextLine();
        prestamos.get(idx).devolverLibro();
        prestamos.remove(idx);
    }
    private static void mostrarLibrosDisponibles(){
        System.out.println("---Libros disponibles---");
        for (Libro l : libros){
            if (l.estaDisponible());
            l.mostrarInfo();
        }
    }
    private static void mostrarPrestamos(){
        System.out.println("---Prestamos activos---");
        for (Prestamo p : prestamos){
            p.mostrarInfo();
        }
    }
}
