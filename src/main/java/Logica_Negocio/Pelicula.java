/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author YULIETH
 */
public class Pelicula {
     public String Nombre ;
   public String Director ;
   public String Genero ;
   public int Horas ;
   public int Minutos ;
   public int Segundos ;
   public int Año_estreno ;
  
   
    public Pelicula () {
       
   }

    public Pelicula(String Nombre, String Director, String Genero, int Horas, int Minutos, int Segundos, int Año_estreno ) {
        this.Nombre = Nombre;
        this.Director = Director;
        this.Genero = Genero;
        this.Horas = Horas;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Año_estreno = Año_estreno;
        
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public void setAño_estreno(int Año_estreno) {
        this.Año_estreno = Año_estreno;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getDirector() {
        return Director;
    }

    public String getGenero() {
        return Genero;
    }

    public int getHoras() {
        return Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public int getAño_estreno() {
        return Año_estreno;
    }

   
    
}
