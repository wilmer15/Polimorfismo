/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public double CalcularNomina(){
        double nomina=0;
        //Polimordismo de asignacion
        for(Empleado empleado: this.empleados){
            //Ligadura Tardia
            nomina+= empleado.Calcular_salario();
        }
        return nomina;
    }
    
    public double calcularNominaProgramadores(){
        double nomina = 0;
        for(Empleado empleado: this.empleados){
            if(empleado instanceof  Programador ){
                nomina+=empleado.Calcular_salario();
            }
            
        }
        return nomina;
    }
    
     public double calcularNominaArquitecto(){
        double nomina = 0;
        for(Empleado empleado: this.empleados){
            if(empleado instanceof  Arquitecto ){
                nomina+=empleado.Calcular_salario();
            }
            
        }
        return nomina;
    }
    
    public ArrayList<Empleado> ListarEmpleado(){
        return this.empleados;
    }
}
