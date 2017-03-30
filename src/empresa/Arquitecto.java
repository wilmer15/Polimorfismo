/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Estudiante
 */
public class Arquitecto extends Empleado {
    
    private double Sueldo;
    
    public Arquitecto(String nombre2){
        super(nombre2);
    }
    
    @Override
     public  double Calcular_salario(){
        return 300;
    }
    
    
   
}
