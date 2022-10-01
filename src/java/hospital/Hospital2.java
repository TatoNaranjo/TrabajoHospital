/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Acer
 */
public class Hospital2 implements IImprimir {
 ListaClientes listaStMaria = new ListaClientes();
    @Override
    public String impresion() {
       return listaStMaria.listaSantaMaria();

    }

    public Hospital2() {
    }
    
}
