/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_u2_herencia_github;

/**
 *
 * @author Anyel
 */
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado correctamente.");
    }

    public void listarMateriales() {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }

        for (Material material : materiales) {
            material.mostrarInfo();
            System.out.println("---------------------------");
        }
    }

    public Material buscarPorCodigo(String codigo) {
        for (Material material : materiales) {
            if (material.getCodigo().equalsIgnoreCase(codigo)) {
                return material;
            }
        }
        return null;
    }

    public void buscarPorTitulo(String titulo) {
        boolean encontrado = false;

        for (Material material : materiales) {
            if (material.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                material.mostrarInfo();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún material con ese título.");
        }
    }

    public void prestarMaterial(String codigo) {
        Material material = buscarPorCodigo(codigo);

        if (material == null) {
            System.out.println("No se encontró un material con ese código.");
            return;
        }

        try {
            material.prestar();
        } catch (MaterialNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverMaterial(String codigo) {
        Material material = buscarPorCodigo(codigo);

        if (material == null) {
            System.out.println("No se encontró un material con ese código.");
            return;
        }

        try {
            material.devolver();
        } catch (MaterialNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarTotalMateriales() {
        System.out.println("Total de materiales registrados: " + Material.contadorMateriales);
    }
}
