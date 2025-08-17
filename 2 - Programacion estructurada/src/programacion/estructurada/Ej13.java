package programacion.estructurada;

public class Ej13 {
    
    public static void show(double precios[], int n){
        if (n >= precios.length){
            return;            
        }
        System.out.println("Precio: "+ precios[n]);
        show(precios, n +1);
    }
    
    public static void main(String[] args){
        
        double precios[] = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales..");
        show(precios, 0);
        
        precios[4] = 2.47;
        
        System.out.println("Ultimo precio cambiado..");
        show(precios, 0);
    }
}