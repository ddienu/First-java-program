package gallonToLiters;

import java.util.Scanner;

public class convertion {

	public static void main(String[] args) {
		
		  Scanner Leer = new Scanner (System.in);
          double Galones, Litros;
          System.out.println("Ingrese la cantidad de galones");
          Galones=Leer.nextDouble();
          Litros=Galones*3.7845;
          System.out.println("La cantidad de galones en litros es: "+Litros +"L" );
		
	}

}
