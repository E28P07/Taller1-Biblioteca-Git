package com.mycompany.taller1.biblioteca.git;

public class Libro extends Material {
    private String autor;
    private boolean disponible;

    public Libro(String codigo, String titulo, String anioPublicacion, String autor, boolean disponible) {
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
