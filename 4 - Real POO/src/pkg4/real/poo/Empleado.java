
package pkg4.real.poo;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    private static int idGen;

    // Constructor 1
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Constructor 2
    public Empleado(String nombre, String puesto) {
        this(idGenerator(), nombre, puesto, 850000);
    }
    
    private static int idGenerator(){
        return ++idGen;
    }
    
    public void actualizarSalario(int porcentaje){
        this.salario *= 1 + (porcentaje / 100.0);
    }
    
    public void actualizarSalario(double monto){
        this.salario += monto;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println(totalEmpleados);
    }
}
