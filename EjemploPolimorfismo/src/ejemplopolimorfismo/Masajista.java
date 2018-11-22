/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author David
 */
public class Masajista extends PersonaEquipo {

    private String titulacion;

   // constructor, getter y setter
    public Masajista(int id, String nombre, String apellidos, int edad, String tit) {
        super(id, nombre, apellidos, edad);
        setTitulacion(tit);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String tit) {
        titulacion = tit;
    }

    @Override
    public void entrenamiento(){
        //editado
        System.out.printf("%d %s %s, da asistencia en el entrenamiento (Clase Masajista). Su título es %s\n", super.getId(),super.getNombre(),super.getApellidos(),getTitulacion());
    }

   /* public void darMasaje() {
        System.out.println("Da un Masaje");
    }*/
}
