package pkg7.herencia.y.polimorfismo;

import java.util.Scanner;

public class HerenciaYPolimorfismo {

    public static void main(String[] args) {

        Menu();
    }

    public static void Menu() {
        Scanner scn = new Scanner(System.in);
        int n = -1;

        System.out.println("====================\n== MENU PRINCIPAL ==\n====================\n");
            imprimirOpciones();
            
        while (n != 0) {
            System.out.println("");n = scn.nextInt();

            switch (n) {
                case 1:
                    pkg7.herencia.y.polimorfismo.vehiculos.Main.main(new String[]{});
                    imprimirOpciones();
                    break;
                case 2:
                    pkg7.herencia.y.polimorfismo.figurasGeometricas.Main.main(new String[]{});
                    imprimirOpciones();
                    break;
                case 3:
                    pkg7.herencia.y.polimorfismo.empleados.Main.main(new String[]{});
                    imprimirOpciones();
                    break;
                case 4:
                    pkg7.herencia.y.polimorfismo.animales.Main.main(new String[]{});
                    imprimirOpciones();
                    break;
                case 5:
                    pkg7.herencia.y.polimorfismo.sistemaDePagos.Main.main(new String[]{});
                    imprimirOpciones();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...\n\nGracias!");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
    }
    
    public static void imprimirOpciones(){
        System.out.println("\nOpciones:\n"
                    + "1. Vehiculos\n"
                    + "2. Figuras Geometricas\n"
                    + "3. Empleados\n"
                    + "4. Animales\n"
                    + "5. Sistema de Pagos\n"
                    + "0. Salir\n");
    }
}
