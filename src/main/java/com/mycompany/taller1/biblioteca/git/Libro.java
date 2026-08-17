
package com.mycompany.taller1.biblioteca.git;

public class Libro extends Material {
    private String editorial;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String codigo, String editorial, int numeroPaginas) {
        super(titulo, autor, codigo);
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
}
