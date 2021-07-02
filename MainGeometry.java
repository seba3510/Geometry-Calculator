package leetCode;

import java.util.Scanner;

public class MainGeometry {
	
	
	
	public static  void input() {
		
		Scanner input = new Scanner(System.in);
		
		int opcion = 0 ; 
		
		System.out.println("Geometry Calculator\r\n"
				+ "1. Calculate the Area of a Circle\r\n"
				+ "2. Calculate the Area of a Rectangle\r\n"
				+ "3. Calculate the Area of a Triangle\r\n"
				+ "4. Quit\r\n"
				+ "Enter your choice (1-4): ");
		
		opcion = input.nextInt() ;
		
		
		if(opcion == 1) {
			
			Geometry.CircleArea();
			
		} else if(opcion == 2) {
			
			Geometry.RectangleArea() ; 
			
		} else if(opcion == 3) {
			
			Geometry.TriangleArea() ; 
			
		} else if(opcion == 4) {
			
			System.out.println("Gracias por participar!!");
			
			System.exit(0);
			
			
		} // if
		
		
	} // input

	public static void main(String[] args) {
		
		
		MainGeometry geometry = new MainGeometry() ;
		
		MainGeometry.input();
		

	} // Main

} // Class
