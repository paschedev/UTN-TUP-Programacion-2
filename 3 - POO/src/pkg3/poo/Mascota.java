package pkg3.poo;

public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("Info de "+ nombre+":\nEspecie: "+ especie +"\nEdad: "+edad);
    }
    
    public void cumplirAnios(){
        edad++;
    }
}
