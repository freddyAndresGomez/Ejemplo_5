/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Pelicula;
import java.util.Scanner;

/**
 *
 * @author YULIETH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String Nombre = "";
        String Director = "";
        String Genero = "" ;
        int Horas = 0 ;
        int Minutos =0 ;
        int Segundos = 0 ;
        int Año_estreno = 0 ;
        int Año_actual = 2023 ;
        int Resultado = 0 ;
        
         Pelicula objpelicula = new Pelicula () ;
         
         Scanner scan = new Scanner(System.in) ;
         
        System.out.println("Digite nombre de la pelicula ");
        Nombre = scan.nextLine();
        objpelicula.setNombre(Nombre);
        
        System.out.println("Digite nombre del director de la pelicula ");
        Director= scan.nextLine();
        objpelicula.setDirector(Director);
        
        System.out.println("Digite genero de la pelicula");
        Genero= scan.nextLine();
        objpelicula.setGenero(Genero);
        
        System.out.println("diguete horas de duracion de la pelicula");
        Horas = scan.nextInt();
        objpelicula.setHoras(Horas);
        
        System.out.println("Digite minutos ");
        Minutos= scan.nextInt();
        objpelicula.setMinutos(Minutos);
        
        System.out.println("Digite segundos ");
        Segundos = scan.nextInt();
        objpelicula.setSegundos(Segundos);
        
         System.out.println("Digite año de estreno ");
        Año_estreno= scan.nextInt();
        objpelicula.setAño_estreno(Año_estreno);
        
         if ((Año_estreno > Año_actual ) ) {
           
     System.out.println("Diguite año en que se va estrenar la pelicula");
      }
         
         System.out.println("***** PELICULA*****"+"\t");
   
   System.out.println("el nombre de la pelicula es :"+"\t"+objpelicula.getNombre());
   System.out.println("el nombre del director es  :"+"\t"+objpelicula.getDirector());
   System.out.println("el genero de la pelicula es :"+"\t"+objpelicula.getGenero());
   System.out.println("duracion total de la pelicula  :"+"\t"+objpelicula.getHoras()+":"+objpelicula.getMinutos()+":"+objpelicula.getSegundos());
     
     if ((Año_estreno > Año_actual ) ) {
           
      System.out.println("la pelicula se estrenara en :"+"\t"+objpelicula.getAño_estreno()); 
     } else if  ( (Año_estreno <= Año_actual) ) {
        
        Resultado = Año_actual - Año_estreno ;
        System.out.println("años de vigencia de la pelicula  :"+"\t"+ Resultado);
        
        System.out.println("la pelicula se estreno:"+"\t"+objpelicula.getAño_estreno()); 
    
   }
        System.out.println("***FIN DEL PROGRAMA***"+"\t"); 
        
    }
    
}
