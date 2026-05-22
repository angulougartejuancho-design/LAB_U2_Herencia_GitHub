/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author PC
 */
public class Revista extends Material {

    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo,
            String codigo,
            int numeroEdicion,
            String mesPublicacion) {

        super(titulo, codigo);

        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void mostrarInfo() {

        System.out.println("=== Información de Revista ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    }

}
