/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author Anyel
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion = 0;

        do {
            System.out.println("\n===== MENÚ BIBLIOTECA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar revista");
            System.out.println("3. Agregar tesis");
            System.out.println("4. Agregar audiolibro");
            System.out.println("5. Listar todos los materiales");
            System.out.println("6. Buscar material por código");
            System.out.println("7. Buscar material por título");
            System.out.println("8. Prestar material");
            System.out.println("9. Devolver material");
            System.out.println("10. Mostrar total de materiales registrados");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        agregarLibro(sc, biblioteca);
                        break;

                    case 2:
                        agregarRevista(sc, biblioteca);
                        break;

                    case 3:
                        agregarTesis(sc, biblioteca);
                        break;

                    case 4:
                        agregarAudioLibro(sc, biblioteca);
                        break;

                    case 5:
                        biblioteca.listarMateriales();
                        break;

                    case 6:
                        System.out.print("Ingrese el código: ");
                        String codigoBuscar = sc.nextLine();

                        Material material = biblioteca.buscarPorCodigo(codigoBuscar);

                        if (material != null) {
                            material.mostrarInfo();
                        } else {
                            System.out.println("No se encontró un material con ese código.");
                        }
                        break;

                    case 7:
                        System.out.print("Ingrese el título: ");
                        String titulo = sc.nextLine();
                        biblioteca.buscarPorTitulo(titulo);
                        break;

                    case 8:
                        System.out.print("Ingrese el código del material a prestar: ");
                        String codigoPrestar = sc.nextLine();
                        biblioteca.prestarMaterial(codigoPrestar);
                        break;

                    case 9:
                        System.out.print("Ingrese el código del material a devolver: ");
                        String codigoDevolver = sc.nextLine();
                        biblioteca.devolverMaterial(codigoDevolver);
                        break;

                    case 10:
                        biblioteca.mostrarTotalMateriales();
                        break;

                    case 11:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }

        } while (opcion != 11);

        sc.close();
    }

    public static void agregarLibro(Scanner sc, Biblioteca biblioteca) {
        try {
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Cantidad de páginas: ");
            int paginas = Integer.parseInt(sc.nextLine());

            System.out.println("Género disponible:");
            for (Genero g : Genero.values()) {
                System.out.println("- " + g);
            }

            System.out.print("Ingrese el género: ");
            Genero genero = Genero.valueOf(sc.nextLine().toUpperCase());

            Libro libro = new Libro(titulo, codigo, autor, paginas, genero);
            biblioteca.agregarMaterial(libro);

        } catch (Exception e) {
            System.out.println("Error al agregar libro. Revise los datos ingresados.");
        }
    }

    public static void agregarRevista(Scanner sc, Biblioteca biblioteca) {
        try {
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Número de edición: ");
            int edicion = Integer.parseInt(sc.nextLine());

            System.out.print("Mes de publicación: ");
            String mes = sc.nextLine();

            Revista revista = new Revista(titulo, codigo, edicion, mes);
            biblioteca.agregarMaterial(revista);

        } catch (Exception e) {
            System.out.println("Error al agregar revista.");
        }
    }

    public static void agregarTesis(Scanner sc, Biblioteca biblioteca) {
        try {
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Universidad: ");
            String universidad = sc.nextLine();

            System.out.print("Año de publicación: ");
            int anio = Integer.parseInt(sc.nextLine());

            Tesis tesis = new Tesis(titulo, codigo, autor, universidad, anio);
            biblioteca.agregarMaterial(tesis);

        } catch (Exception e) {
            System.out.println("Error al agregar tesis.");
        }
    }

    public static void agregarAudioLibro(Scanner sc, Biblioteca biblioteca) {
        try {
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Narrador: ");
            String narrador = sc.nextLine();

            System.out.print("Duración en minutos: ");
            int duracion = Integer.parseInt(sc.nextLine());

            AudioLibro audioLibro = new AudioLibro(titulo, codigo, narrador, duracion);
            biblioteca.agregarMaterial(audioLibro);

        } catch (Exception e) {
            System.out.println("Error al agregar audiolibro.");
        }
    }
}
