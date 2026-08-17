package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    
        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    // aquí llamas a los métodos CRUD de clientes
                    break;
                case 2:
                    // aquí llamas a los métodos CRUD de libros
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void agregarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        Cliente cliente = new Cliente(nombre, cedula, direccion, telefono);
        clientes.add(cliente);
        System.out.println("✅ Cliente agregado correctamente.");
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente c : clientes) {
                System.out.println("Nombre: " + c.getNombre()
                        + ", Cédula: " + c.getCedula()
                        + ", Dirección: " + c.getDireccion()
                        + ", Teléfono: " + c.getTelefono());
            }
        }
    }

    public static Cliente buscarCliente(String cedula) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    public static void actualizarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula del cliente a actualizar: ");
        String cedula = sc.nextLine();

        Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
            System.out.print("Nuevo nombre: ");
            cliente.setNombre(sc.nextLine());
            System.out.print("Nueva dirección: ");
            cliente.setDireccion(sc.nextLine());
            System.out.print("Nuevo teléfono: ");
            cliente.setTelefono(sc.nextLine());
            System.out.println("✅ Cliente actualizado correctamente.");
        } else {
            System.out.println("❌ Cliente no encontrado.");
        }
    }

    public static void eliminarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula del cliente a eliminar: ");
        String cedula = sc.nextLine();

        Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("✅ Cliente eliminado correctamente.");
        } else {
            System.out.println("❌ Cliente no encontrado.");
        }
    }

    public static void crearLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Título: ");
    String titulo = sc.nextLine();
    System.out.print("Autor: ");
    String autor = sc.nextLine();
    System.out.print("Código: ");
    String codigo = sc.nextLine();
    System.out.print("Editorial: ");
    String editorial = sc.nextLine();
    System.out.print("Número de páginas: ");
    int paginas = sc.nextInt();
    sc.nextLine(); // limpiar buffer

    Libro libro = new Libro(titulo, autor, codigo, editorial, paginas);
    libros.add(libro);
    System.out.println("✅ Libro agregado correctamente.");
}

    public static void listarLibros() {
    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
    } else {
        for (Libro l : libros) {
            System.out.println("Título: " + l.getTitulo() +
                               ", Autor: " + l.getAutor() +
                               ", Código: " + l.getCodigo() +
                               ", Editorial: " + l.getEditorial() +
                               ", Páginas: " + l.getNumeroPaginas());
        }
    }
}

    public static Libro buscarLibro(String codigo) {
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigo)) {
            return l;
        }
    }
    return null;
}

    public static void actualizarLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el código del libro a actualizar: ");
    String codigo = sc.nextLine();

    Libro libro = buscarLibro(codigo);
    if (libro != null) {
        System.out.print("Nuevo título: ");
        libro.setTitulo(sc.nextLine());
        System.out.print("Nuevo autor: ");
        libro.setAutor(sc.nextLine());
        System.out.print("Nueva editorial: ");
        libro.setEditorial(sc.nextLine());
        System.out.print("Nuevo número de páginas: ");
        libro.setNumeroPaginas(sc.nextInt());
        sc.nextLine(); // limpiar buffer
        System.out.println("✅ Libro actualizado correctamente.");
    } else {
        System.out.println("❌ Libro no encontrado.");
    }
}

    public static void eliminarLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el código del libro a eliminar: ");
    String codigo = sc.nextLine();

    Libro libro = buscarLibro(codigo);
    if (libro != null) {
        libros.remove(libro);
        System.out.println("✅ Libro eliminado correctamente.");
    } else {
        System.out.println("❌ Libro no encontrado.");
    }
}
    
}
