/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author angul
 */
public abstract class Material {

    private String titulo;
    private String codigo;
    private boolean disponible;

    public static int contadorMateriales;

    public Material(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponible = true;
        contadorMateriales++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() throws MaterialNoDisponibleException {

        if (disponible) {

            disponible = false;
            System.out.println("Material prestado.");

        } else {

            throw new MaterialNoDisponibleException(
                    "El material no está disponible para préstamo.");
        }
    }

    public void devolver() throws MaterialNoDisponibleException {

        if (!disponible) {

            disponible = true;
            System.out.println("Material devuelto.");

        } else {

            throw new MaterialNoDisponibleException(
                    "El material ya estaba disponible.");
        }
    }

    public abstract void mostrarInfo();

}
