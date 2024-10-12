/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

public class Singleton {
    // Instancia única de la clase, inicialmente no creada (null)
    private static Singleton instancia;

    // Constructor privado para evitar la creación de nuevas instancias
    private Singleton() {
        System.out.println("Se ha creado una nueva instancia de Singleton");
    }

    // Método público y estático para obtener la instancia, con control de concurrencia
    public static synchronized Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("¡Soy la única instancia del Singleton!");
    }
}
