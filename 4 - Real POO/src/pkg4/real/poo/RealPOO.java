package pkg4.real.poo;


public class RealPOO {

    
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(4, "Gaston", "BackendDev", 1200000);
        Empleado emp2 = new Empleado("Tomas", "FullStack");
        
        System.out.println(emp1 + "\n" + emp2);
        
        Empleado.mostrarTotalEmpleados();
    }
    
}
