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
public class Entrenador extends PersonaEquipo {

    private int idFederacion;

   // constructor, getter y setter
    public Entrenador(int id, String nombre, String apellidos, int edad, int identificador_federacion) {
        super(id, nombre, apellidos, edad);
        idFederacion = identificador_federacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void entrenamiento() {
        //editado
        System.out.printf("%d %s %s, dirige un entrenamiento (Clase Entrenador). Su identificación es %d\n",super.getId(),super.getNombre(),super.getApellidos(),getIdFederacion());
    }

    
}
