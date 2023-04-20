package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class ListaGenerica<T extends Comparable<T>> {
    private List<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    //1.Agregar
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    //2.Devolver
    public List<T> getLista() {
        return lista;
    }

    //3.Tamaño Lista
    public int obtenerCantidadElementos() {
        return lista.size();
    }

    //4.Agregar al principio
    public void agregarElementoAlPrincipio(T elemento) {
        lista.add(0, elemento);
    }


    //5.Ordenar
    public void ordenarLista() {
        Collections.sort(lista);
    }

    //6.Desordenar
    public void desordenarLista() {
        Collections.shuffle(lista);
    }

    //7.Almacenar en posicion n
    public void almacenarElementoEnPosicion(int posicion, T elemento) throws IndexOutOfBoundsException {
        if (posicion > lista.size()) {
            throw new IndexOutOfBoundsException("El índice es mayor que la cantidad de elementos en la lista.");
        }
        lista.add(posicion, elemento);
    }

    //8.Devolver posicion
    public T obtenerElementoEnPosicion(int posicion) throws IndexOutOfBoundsException {
        if (posicion >= lista.size()) {
            throw new IndexOutOfBoundsException("El índice es mayor o igual que la cantidad de elementos en la lista.");
        }
        return lista.get(posicion);
    }


    //9.Devolver primera posicion
    public T obtenerPrimerElemento() throws NoSuchElementException {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía.");
        }
        return lista.get(0);
    }

    //10.Devolver ultima posicion
    public T obtenerUltimoElemento() throws NoSuchElementException {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía.");
        }
        return lista.get(lista.size() - 1);
    }

    //11.Remover posicion
    public T removerElementoEnPosicion(int posicion) throws NoSuchElementException {
        if (posicion >= lista.size()) {
            throw new IndexOutOfBoundsException("La posición especificada está fuera del rango de la lista");
        }
        T elemento = lista.get(posicion);
        if (elemento == null) {
            throw new NoSuchElementException("El elemento en la posición especificada no existe en la lista");
        }
        lista.remove(posicion);
        return elemento;
    }

}