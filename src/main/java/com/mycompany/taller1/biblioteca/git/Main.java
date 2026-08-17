package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void listarClientes() {
        for (Cliente c : clientes) {
            System.out.println("Nombre: " + c.getNombre() +
                               ", Cedula: " + c.getCedula() +
                               ", Direccion: " + c.getDireccion() +
                               ", Telefono: " + c.getTelefono());
        }
    }

    public static void main(String[] args) {
        // Aquí luego irá el menú
    }
}
