/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Acer
 */

//Se crea la clase Hospital1
public class Hospital1 implements IImprimir{
    //Se crea un nuevo Objeto de la Clase ListaClientes, llamado SanRafael
ListaClientes sanRafael = new ListaClientes();
    @Override
//Le damos acciones al método Impresión. En este caso, hacemos un Retorno de la función listaSanRafael.
    public String impresion() {
        return sanRafael.listaSanRafael();
        }
//Creamos un constructor normal de la Clase Hospital
    public Hospital1() {
    }
    
    }
    
        

