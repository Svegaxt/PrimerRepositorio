package com.umg.Main;
import com.umg.Estructuras.ListaSimple;
import com.umg.Nodos.NodoSimple;

public class Main {
            public static void main(String[] args) {
                Main t = new Main();
                t.testListaSimple();
        }
    public void testListaSimple(){
        ListaSimple ls = new ListaSimple();
        System.out.println("Insertar nodos 1, 2 y 3");
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        ls.insertar(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        ls.insertar(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        ls.insertar(nuevo);
        ls.imprimir();

        System.out.println("Buscar nodo 2 en la lista");
        NodoSimple nodo = ls.buscar(2);
        System.out.println("Encontrado NodoSimple = "+ nodo.getDesc());

        System.out.println("Eliminar nodo 3 de la lista");
//        boolean borrado = ls.eliminarV1(3);
//        System.out.println("Nodo 3"+ (borrado ? "borrado":"no borrado"));
//        ls.imprimir();

        boolean borrado = ls.eliminarV2(3);
        System.out.println("Nodo 3" + (borrado ? "borrado" : "no borrado"));
        ls.imprimir();

        System.out.println("Agregar nodos 3, 4 y 5");
        nuevo = new NodoSimple(5, "CINCO");
        ls.insertar(nuevo);

        nuevo = new NodoSimple(4, "CUATRO");
        ls.insertarEntre(2, nuevo);

        nuevo = new NodoSimple(3, "TRES");
        ls.insertarEntre(2, nuevo);
        ls.imprimir();
    }
}

