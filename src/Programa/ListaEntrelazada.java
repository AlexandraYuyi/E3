/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

public class ListaEntrelazada implements Cloneable {
    Nodo cabeza;
    int size;

    public ListaEntrelazada() {
        this.cabeza = null;
        this.size = 0;
    }

    public void enlazar(int valor){
        if(cabeza==null){
            cabeza = new Nodo(valor);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazarSiguiente(temp);
            cabeza= nuevo;
        }
        size++;
    }

    public int getSize() {
        return size;
    }
    
    public boolean estaVacia(){
        return cabeza == null;
    }
    
    public int obtenerValor(int index){
        int contador = 0;
        Nodo temp = cabeza;
        while(contador<index){
            temp = temp.getSiguiente();
            contador++;
        }
        return temp.getValor();
    }
    
    public Nodo obtenerNodo(int index){
        int contador = 0;
        Nodo temp = cabeza;
        while(contador<index){
            temp = temp.getSiguiente();
            contador++;
        }
        return temp;
    }
    
    public void eliminar(int index){
        if (index==0){
            cabeza = cabeza.getSiguiente();
            
        }else{
            int contador =0;
            Nodo temporal = cabeza;
            while(contador<index-1){
                temporal = temporal.getSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
        }
        size--;
    }
    
    public String mostrarLista(ListaEntrelazada lista) {
    Nodo recorrer = cabeza;
    String mostrar= "";
    int cont=0;
    int size= lista.getSize();
    while (cont < size-1) {
        mostrar += "[" + recorrer.getValor() + "]--->";
        recorrer = recorrer.getSiguiente();
        cont++;
       }
    mostrar += "[" + recorrer.getValor() + "]";
    return mostrar;
    }
    
    public void modificar(int index, int valor){
        obtenerNodo(index).setValor(valor);
//        obtenerNodo(index-1).setSiguiente(obtenerNodo(index));
        
    }
    
    public void ordenarDescendente(ListaEntrelazada lista){
        
        for (int i = 0; i < lista.getSize(); i++) {
            for (int j = 0; j < lista.getSize()-1; j++) {
                if(lista.obtenerValor(j) < lista.obtenerValor(j+1)){
                    int temp1= lista.obtenerValor(j);
                    int temp2= lista.obtenerValor(j+1);
                    modificar(j, temp2);
                    modificar(j+1, temp1);
                }
            }
        }
    }
    
    public void ordenarAscendente(ListaEntrelazada lista){
        for (int i = 0; i < lista.getSize(); i++) {
            for (int j = 0; j < lista.getSize()-1; j++) {
                if(lista.obtenerValor(j) > lista.obtenerValor(j+1)){
                    int temp1= lista.obtenerValor(j);
                    int temp2= lista.obtenerValor(j+1);
                    modificar(j, temp2);
                    modificar(j+1, temp1);
                }
            }
        }
    }
    
}
