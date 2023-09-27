/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listascirculares;


class ListaCircular {
    Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public void agregar(String nombre) {
        Nodo nuevoNodo = new Nodo(nombre);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }

    public void imprimir() {
        if (cabeza != null) {
            Nodo temp = cabeza;
            do {
                System.out.print(temp.nombre + " -> ");
                temp = temp.siguiente;
            } while (temp != cabeza);
            System.out.println("...");
        }
    }
}
