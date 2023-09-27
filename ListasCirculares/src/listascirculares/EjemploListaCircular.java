
package listascirculares;

import java.util.Scanner;

public class EjemploListaCircular {
    public static void main(String[] args) {
        ListaCircular listaAmigos = new ListaCircular();

        Scanner scanner = new Scanner(System.in);
        String nombre;

        while (true) {
            System.out.print("Ingrese el nombre de un amigo (o 'salir' para terminar): ");
            nombre = scanner.nextLine();
            if (nombre.equals("salir")) {
                break;
            }
            listaAmigos.agregar(nombre);
        }

        System.out.println("\nLa cadena de amigos es:");
        listaAmigos.imprimir();
    }
}
