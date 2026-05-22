/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author Daryelin
 */
public class Tesis extends Material{
    private String autor;
    private String universidad;
    private int anioPublicacion;

    public Tesis(String titulo,
            String codigo,
            String autor,
            String universidad,
            int anioPublicacion) {

        super(titulo, codigo);

        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public void mostrarInfo() {

        System.out.println(" Información de Tesis ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
    
}
