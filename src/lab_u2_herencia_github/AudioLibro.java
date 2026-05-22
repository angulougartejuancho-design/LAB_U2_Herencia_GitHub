/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author Daryelin
 */
public class AudioLibro extends Material{
    private String narrador;
    private int duracionMinutos;

    public AudioLibro(String titulo,
            String codigo,
            String narrador,
            int duracionMinutos) {

        super(titulo, codigo);

        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrarInfo() {

        System.out.println(" Información del Audiolibro ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Narrador: " + narrador);
        System.out.println("Duración en minutos: " + duracionMinutos);
    }
}
