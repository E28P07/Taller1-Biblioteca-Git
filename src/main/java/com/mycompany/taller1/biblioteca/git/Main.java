package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menuClientes();
                    break;

                case 2:
                    menuLibros();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);
    }

    // ==================== CLIENTES ====================

    public static void menuClientes() {

        int opcion;

        do {
            System.out.println("\n=== Gestión de Clientes ===");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;

                case 2:
                    listarClientes();
                    break;

                case 3:
                    actualizarCliente();
                    break;

                case 4:
                    eliminarCliente();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);
    }

    public static void agregarCliente() {

        System.out.print("Id: ");
        String id = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(id, nombre, telefono, email);

        clientes.add(cliente);

        System.out.println("✅ Cliente agregado correctamente.");
    }

    public static void listarClientes() {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {

            for (Cliente c : clientes) {

                System.out.println(
                        "Id: " + c.getId()
                        + ", Nombre: " + c.getNombre()
                        + ", Teléfono: " + c.getTelefono()
                        + ", Email: " + c.getEmail()
                );
            }
        }
    }

    public static Cliente buscarCliente(String id) {

        for (Cliente c : clientes) {

            if (c.getId().equals(id)) {
                return c;
            }
        }

        return null;
    }

    public static void actualizarCliente() {

        System.out.print("Ingrese el ID del cliente a actualizar: ");
        String id = sc.nextLine();

        Cliente cliente = buscarCliente(id);

        if (cliente != null) {

            System.out.print("Nuevo nombre: ");
            cliente.setNombre(sc.nextLine());

            System.out.print("Nuevo teléfono: ");
            cliente.setTelefono(sc.nextLine());

            System.out.print("Nuevo email: ");
            cliente.setEmail(sc.nextLine());

            System.out.println("✅ Cliente actualizado correctamente.");

        } else {
            System.out.println("❌ Cliente no encontrado.");
        }
    }

    public static void eliminarCliente() {

        System.out.print("Ingrese el ID del cliente a eliminar: ");
        String id = sc.nextLine();

        Cliente cliente = buscarCliente(id);

        if (cliente != null) {

            clientes.remove(cliente);

            System.out.println("✅ Cliente eliminado correctamente.");

        } else {
            System.out.println("❌ Cliente no encontrado.");
        }
    }

    // ==================== LIBROS ====================

    public static void menuLibros() {

        int opcion;

        do {
            System.out.println("\n=== Gestión de Libros ===");
            System.out.println("1. Crear Libro");
            System.out.println("2. Listar Libros");
            System.out.println("3. Actualizar Libro");
            System.out.println("4. Eliminar Libro");
            System.out.println("0. Volver");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearLibro();
                    break;

                case 2:
                    listarLibros();
                    break;

                case 3:
                    actualizarLibro();
                    break;

                case 4:
                    eliminarLibro();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);
    }

    public static void crearLibro() {

        System.out.print("Código: ");
        String codigo = sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Año de Publicación: ");
        String publicacion = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = sc.nextBoolean();
        sc.nextLine();

        Libro libro = new Libro(
                codigo,
                titulo,
                publicacion,
                autor,
                disponible
        );

        libros.add(libro);

        System.out.println("✅ Libro agregado correctamente.");
    }

    public static void listarLibros() {

        if (libros.isEmpty()) {

            System.out.println("No hay libros registrados.");

        } else {

            for (Libro l : libros) {

                System.out.println(
                        "Código: " + l.getCodigo()
                        + ", Título: " + l.getTitulo()
                        + ", Año Publicación: " + l.getAnioPublicacion()
                        + ", Autor: " + l.getAutor()
                        + ", Disponible: " + l.isDisponible()
                );
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

        System.out.print("Ingrese el código del libro a actualizar: ");
        String codigo = sc.nextLine();

        Libro libro = buscarLibro(codigo);

        if (libro != null) {

            System.out.print("Nuevo título: ");
            libro.setTitulo(sc.nextLine());

            System.out.print("Nuevo Año de Publicación: ");
            libro.setAnioPublicacion(sc.nextLine());

            System.out.print("Nuevo autor: ");
            libro.setAutor(sc.nextLine());

            System.out.print("¿Está disponible? (true/false): ");
            libro.setDisponible(sc.nextBoolean());
            sc.nextLine();

            System.out.println("✅ Libro actualizado correctamente.");

        } else {

            System.out.println("❌ Libro no encontrado.");
        }
    }

    public static void eliminarLibro() {

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