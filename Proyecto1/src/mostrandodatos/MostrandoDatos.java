package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner=new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		String nombre=scaner.nextLine();
		System.out.println("Introduzca sus apellidos:");
		String apellidos=scaner.nextLine();
		System.out.println(nombre+" "+apellidos);
	}

}
