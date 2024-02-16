/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectortolist;

public class Factura {
    private String elemento;
    private int importe;

    public Factura(String elemento, int importe) {
        this.elemento = elemento;
        this.importe = importe;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getImporte() {
        return importe;
    }

    public void setCantidad(int importe) {
        this.importe = importe;
    }

    
}
