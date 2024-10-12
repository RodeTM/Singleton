/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

public class Main {
    public static void main(String[] args) {
       
        Singleton instancia1 = Singleton.getInstancia();
        Singleton instancia2 = Singleton.getInstancia();

       
        instancia1.mostrarMensaje();

        if (instancia1 == instancia2) {
            System.out.println("instancia1 y instancia2 son la misma instancia.");
        } else {
            System.out.println("instancia1 y instancia2 son diferentes instancias.");
        }
    }
}
