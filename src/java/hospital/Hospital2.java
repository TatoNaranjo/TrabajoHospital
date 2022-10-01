/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Acer
 */
//Se crea la Clase Hospital2
public class Hospital2 implements IImprimir {
    
 //Se crea un nuevo Objeto de la Clase ListaClientes, llamado listaStMaria
 ListaClientes listaStMaria = new ListaClientes();
    @Override
    //Le damos acciones al método Impresión. En este caso, hacemos un Retorno de la función listaSantaMaria.
    public String impresion() {
       return listaStMaria.listaSantaMaria();

    }

    public Hospital2() {
    }
    
}
