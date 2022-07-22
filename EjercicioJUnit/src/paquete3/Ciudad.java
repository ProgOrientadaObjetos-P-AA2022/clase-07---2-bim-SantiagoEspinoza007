/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    private String nombre;
    private int poblacion;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerPoblacion(int p){
        poblacion = p;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n", obtenerNombre(), obtenerPoblacion());
        return reporte;
    }
    
    
    
    
}
