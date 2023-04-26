package TrabajoPractico;

import java.util.Scanner;

public class TrabajoPractico {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int opcion;
      
        System.out.println("Seleccione el DiscoRigido que desea realizar el BackUP:");
        System.out.println("1- HDD Seagate: 1Tb");
        System.out.println("2- HDD Hitachi: 900Gb");
        System.out.println("3- HDD WesternDigital:600Gb");
        System.out.println("4- HDD Toshiba: 10Tb");
        System.out.println("5- HDD Kingston: 25Tb");
        System.out.println("---------------------");
        System.out.println("6- SALIR del Programa");
         opcion = sc.nextInt();

				if(opcion > 6){
					System.out.println("La opción ingresada es incorrecta");
				}

        switch(opcion) {
         case 1: 
        	String nameDiscHDD = "Seagate";
        	String capacidadDiscHDD = "1 TB";
        	int capacidadCase1 = 1000000;
        	menuDos(nameDiscHDD, capacidadDiscHDD, capacidadCase1);
        	break;
         case 2:
         	String nameDiscHDD2 = "Hitachi";
         	String capacidadDiscHDD2 = "900GB";
        	int capacidadCase2 = 900000;
          menuDos(nameDiscHDD2, capacidadDiscHDD2, capacidadCase2);
        	break;
         case 3:
          String nameDiscHDD3 = "WesternDigital";
        	String capacidadDiscHDD3 = "600GB";
        	int capacidadCase3 = 600000;
        	menuDos(nameDiscHDD3, capacidadDiscHDD3, capacidadCase3);
        	break;
         case 4:
          String nameDiscHDD4 = "Toshiba";
          String capacidadDiscHDD4 = "10 GB";
          int capacidadCase4 = 10000000;
          menuDos(nameDiscHDD4, capacidadDiscHDD4, capacidadCase4);
          break;
          case 5:
          String nameDiscHDD5 = "Kingston";
        	String capacidadDiscHDD5 = "25 TB";
        	int capacidadCase5 = 25000000;
         	menuDos(nameDiscHDD5, capacidadDiscHDD5, capacidadCase5);
        	break;
            case 6:
        	System.out.println("Ha salido del programa correctamente");
         	break;
       }
    }
    public static void menuDos (String caso, String capacidadString, int capacidadEnMB) {
    	Scanner sc = new Scanner(System.in);
    	int opcionMenu2;
    	System.out.println("Seleccione el Elemento en donde realizar el BackUP:");
    	System.out.println("1 - CDs: 700Mb");
    	System.out.println("2 - DVDs: 4,7Gb");
    	System.out.println("3 - BluRay: 25Gb");
    	System.out.println("------------------");
    	opcionMenu2 = sc.nextInt();

    	if(opcionMenu2 == 1) {
    		System.out.println("Para el HDD: " + caso);
    		System.out.println("Con la capacidad: " + capacidadString);
    		calcularBackUp(1, caso, capacidadEnMB, capacidadString);
    	}
    	if(opcionMenu2 == 2) {
    		System.out.println("Para el HDD: " + caso);
    		System.out.println("Con la capacidad: " + capacidadString);
    		calcularBackUp(2, caso, capacidadEnMB, capacidadString);
    	}
    	if(opcionMenu2 == 3) {
    		System.out.println("Para el HDD: " + caso);
    		System.out.println("Con la capacidad: " + capacidadString);
    		calcularBackUp(3, caso, capacidadEnMB, capacidadString);
    	}
    }
    
    public static void calcularBackUp (int elementBackUp, String disco, int capacidadEnMb, String capacidadEnString) {
    	switch(elementBackUp) {
    	case 1 : 
    		int calculo = capacidadEnMb / 700;
    		System.out.println("La cantidad de CDs para el BackUp es: " + calculo +  " CDs");
    		break;
    	case 2:
    		int calculoCase2 = capacidadEnMb / 47000;
    		System.out.println("La cantidad de DVDs para el BackUp es: " + calculoCase2 + " DVDs");
    		break;
    	case 3:
    		int calculoCase3 = capacidadEnMb / 25000;
    		System.out.println("La cantidad de BluRay para el BackUp es: " +  calculoCase3 + " BluRays");
    		break;
    	}
    	System.out.println("------------------------------------------------------");
    	System.out.println("4 - Desea calcular el resguardo en otro medio?");
    	System.out.println("5 - Volver al #Menu1 para realizar el BackUP de otro HDD");
    	System.out.println("------------------------------------------------------");
    	Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 4:
                menuDos(disco, capacidadEnString,capacidadEnMb);
                break;
            case 5:
                main(null);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}