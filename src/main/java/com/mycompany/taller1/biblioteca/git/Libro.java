/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author RCC Ing
 */
public class Libro extends Material {
    private String autor;
    private String disponible;

    public Libro(String codigo, String titulo, String anioPublicacion, String editorial, int numeroPaginas) {
        super(codigo, titulo, anioPublicacion);
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
}
