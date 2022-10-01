/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author Acer
 */
public class Hospital1 implements IImprimir{
ListaClientes sanRafael = new ListaClientes();
    @Override

    public String impresion() {
        return sanRafael.listaSanRafael();
        }

    public Hospital1() {
    }
    
    }
    
        

