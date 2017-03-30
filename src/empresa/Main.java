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

public class Main {
    
     public static int menu(){
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.agregar"+"\n2.Listar"+"\n3.Nomina"+"\n4.nomina pogramador"+"\n5.Nomina Arquitecto" +"\n6.Salir");
        opcion = teclado.nextInt();
        return opcion;
    }
    

    public static void main(String[] agrs){
        
        
        
        int opcion=-1;
        Empresa empresa = new Empresa();
        Scanner teclado = new Scanner(System.in);
        
        
     
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                  System.out.println("Ingrese el nombre del empleado");
                  String nombre= teclado.next();
                  System.out.println("Tipo de empleado: 1.Programador 2. Arquitecto");
                  int Tipo= teclado.nextInt();
                  Empleado empleado = null;
                  
                  if(Tipo==1){
                      empleado = new Programador(nombre);
                  }
                   if(Tipo==2){
                       empleado = new Arquitecto(nombre);
                  }
                   empresa.agregarEmpleado(empleado);
                   break;
                case 2:
                    ArrayList<Empleado> empleados = empresa.ListarEmpleado();
                    for(int i = 0; i<empleados.size(); i++){
                        Empleado e = empleados.get(i);
                        if(e instanceof Programador){
                            System.out.println(e.getNombre() + "  Programador");
                        }else{
                            System.out.println(e.getNombre() + "  Arquitecto");
                        }
                    }
                   break;
                case 3:
                    
                    double nomina=empresa.CalcularNomina();
                    System.out.println("Nomina" + nomina);
                   break;
                case 4:
                    double nominap=empresa.calcularNominaProgramadores();
                    System.out.println("Nomina pROGRAMADOR" + nominap);
                   break;
                case 5:
                    System.out.println("Chao");
                break;
                case 6:
                    double nominaa=empresa.calcularNominaArquitecto();
                    System.out.println("Nomina Arquitecto" + nominaa);
                break;
                        
                default:
                System.out.println("Invalido");
                           
            }
            
        }while(!(opcion==6));
        
    }
    

    
}
