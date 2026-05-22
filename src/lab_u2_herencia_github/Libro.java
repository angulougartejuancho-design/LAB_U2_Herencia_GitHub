/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author PC
 */
public class Libro extends Material {

    private String autor;
    private int cantidadPaginas;
    private Genero genero;

    public Libro(String titulo,
            String codigo,
            String autor,
            int cantidadPaginas,
            Genero genero) {

        super(titulo, codigo);

        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de páginas: " + cantidadPaginas);
        System.out.println("Género: " + genero);
    }
}
