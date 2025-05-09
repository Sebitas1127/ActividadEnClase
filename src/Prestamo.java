/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.time.LocalDate;

public class Prestamo {
    private Cliente cliente;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private String estado;
    private LocalDate fechaPrestamo;

    public Prestamo(Libro libro, Cliente cliente, LocalDate fechaInicio, LocalDate fechaDevolucion, String estado){
        this.cliente = cliente;
        this.estado = estado;
        this.fechaDevolucion = fechaPrestamo.plusDays(15);
        libro.prestar();
        this.fechaInicio = fechaInicio;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
    }

    public Prestamo(Cliente cliente, Libro libro) {
    }

    public void devolverLibro(){
        libro.devolver();
        System.out.println("libro devuelto por el usuario: " + cliente.nombre);
    }

    public void mostrarInfo(){
        System.out.println("Prestamo: " + cliente.nombre + "Tiene el libro: " + libro.getTitulo() + "Desde "
                + fechaPrestamo + "hasta " + fechaDevolucion);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}
