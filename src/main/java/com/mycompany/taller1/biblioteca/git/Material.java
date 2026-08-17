
package com.mycompany.taller1.biblioteca.git;

public class Material {
    private String titulo;
    private String autor;
    private String codigo;

    public Material(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }
}
