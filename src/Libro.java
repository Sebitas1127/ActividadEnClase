/*
 * Copyright (c) 2025. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible = true;

    public Libro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean estaDisponible(){
        return disponible;
    }

    public void prestar(){
        disponible = false;
    }

    public void devolver(){
        disponible = true;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "Autor: " + autor + "Disponible: " + (disponible ? "Si" : "No"));
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
